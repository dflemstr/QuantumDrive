package org.quantumdrive.core

import scala.actors._
import org.quantumdrive.core.message._
import scala.actors.Actor._

class RealTimeCore() extends Core {
  private var state = State.Startup
  private var players = List[Player]()
  private var map: Option[MetaMap] = None
  
  def initialize() = {
    //TODO: implement
  }

  private def shoutBack(error: String) = reply(new RuntimeException(error))

  /** Top-level message dispatcher: dispatches messages depending on which state we're in */
  def act = loop {
    state match {
      case State.Startup =>
        receive(handleStartup orElse {case x => shoutBack("Can't handle " + x + " during startup!")})
      case State.Ingame =>
        receive(handleIngame orElse {case x => shoutBack("Can't handle " + x + " in-game!")})
      case State.Shutdown =>
        receive(handleShutdown orElse {case x => shoutBack("Can't handle " + x + " during shutdown!")})
    }
  }

  private val handleStartup: PartialFunction[Any, Unit] = {
    case AddPlayer(player) =>
      players ::= player
      reply(OK)
    case SetMap(map) =>
      this.map = Some(map)
      reply(OK)
  }

  private val handleIngame: PartialFunction[Any, Unit] = {
    case _ => 
  }

  private val handleShutdown: PartialFunction[Any, Unit] = {
    case _ =>
  }

  private object State extends Enumeration {
    val Startup, Ingame, Shutdown = Value
  }
}
