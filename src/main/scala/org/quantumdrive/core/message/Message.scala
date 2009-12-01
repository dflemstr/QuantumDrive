package org.quantumdrive.core.message

import org.quantumdrive.core.model.MetaMap
import org.quantumdrive.core.Player

/**
 * The base trait for all messages.
 * Sealed, because we don't want it to be extended from outside of this compilation unit.
 */
sealed trait Message

/** StartupMessages are sent before the game actually begins */
sealed trait StartupMessage extends Message

/** IngameMessages are sent in-game */
sealed trait IngameMessage extends Message

/** ShutdownMessages are sent during game shutdown */
sealed trait ShutdownMessage extends Message

/** ErrorMessages are sent when something goes wrong */
sealed trait ErrorMessage extends Message {
  val message: String
}

/*
 * The following messages are responses that the core sends to other instances
 */

/** Indicates that a command succeeded */
object OK extends Message

/** Indicates that the sent command could not complete, because it wasn't supported by the receiver */
case class OperationNotSupported(message: String) extends ErrorMessage

/** Indicates that the sent command could not complete, because an error occured */
case class OperationFailed(message: String) extends ErrorMessage

/** Indicates that the sent command could not complete, because the core didn't have a map loaded */
case class NoMapSpecified(message: String) extends ErrorMessage

/** Indicates that the game was started */
object GameStarted extends Message

/*
 * The following messages are commands that are sent to the core
 */

/** Add this player to the core's simulation */
case class AddPlayer(player: Player) extends StartupMessage

/** Change the active map to the specified map */
case class SetMap(to: MetaMap) extends StartupMessage

/** Start the game */
object StartGame extends StartupMessage
