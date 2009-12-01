package org.quantumdrive.core

import scala.actors._
import org.quantumdrive.core.message._
import org.quantumdrive.core.model._
import scala.actors.Actor._

class RealTimeCore() extends Core {
  @volatile private var state = State.Inactive
  @volatile private var players = List[Player]()
  @volatile private var metaMap: Option[MetaMap] = None
  
  def initialize() = {
    //Starts the actor
    start()
    state = State.Startup
  }

  /** Top-level message dispatcher: dispatches messages depending on which state we're in */
  def act = loop {
    receive {
      case msg: StartupMessage  if state == State.Startup  && (handleStartup  isDefinedAt msg) =>
        handleStartup(msg)
      case msg: IngameMessage   if state == State.Ingame   && (handleIngame   isDefinedAt msg) =>
        handleIngame(msg)
      case msg: ShutdownMessage if state == State.Shutdown && (handleShutdown isDefinedAt msg) =>
        handleShutdown(msg)
      case x =>
        reply(OperationNotSupported("Cannot handle this message right now."))
    }
  }

  /** Handles startup messages */
  private val handleStartup: PartialFunction[StartupMessage, Unit] = {
    case AddPlayer(player) =>
      players ::= player
      reply(OK)
    case SetMap(map) =>
      metaMap = Some(map)
      reply(OK)
    case StartGame => metaMap match {
      case Some(map) =>
        try {
          loadMap(map)
          state = State.Ingame
          players.foreach(_.getChannel! GameStarted)
          reply(OK)
        } catch {
          case x => reply(OperationFailed("Map could not be loaded, error: " + x.getMessage))
        }
      case None =>
        reply(NoMapSpecified("No map loaded!"))
    }
  }

  /** Handles in-game messages */
  private val handleIngame: PartialFunction[IngameMessage, Unit] = {
    case _ => 
  }

  /** Handles shutdown messages */
  private val handleShutdown: PartialFunction[ShutdownMessage, Unit] = {
    case _ =>
  }

  private def loadMap(map: MetaMap) = {
    
  }

  private object State extends Enumeration {
    val Inactive, Startup, Ingame, Shutdown = Value
  }
}
