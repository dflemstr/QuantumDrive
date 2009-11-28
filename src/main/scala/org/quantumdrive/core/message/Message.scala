package org.quantumdrive.core.message

import org.quantumdrive.core.MetaMap
import org.quantumdrive.core.Player

/**
 * The base trait for all messages.
 * Sealed, because we don't want it to be extended from
 * outside of this compilation unit
 */
sealed trait Message

/**
 * StartupMessages are sent before the game actually begins
 */
sealed trait StartupMessage extends Message

/**
 * IngameMessages are sent in-game
 */
sealed trait IngameMessage extends Message

/**
 * ShutdownMessages are sent during game shutdown
 */
sealed trait ShutdownMessage extends Message

/**
 * Indicates that a command succeeded
 */
object OK extends Message

/*
 * The following messages are commands that are sent to the core
 */
case class AddPlayer(player: Player) extends StartupMessage

/** Change the active map to the specified map */
case class SetMap(to: MetaMap) extends StartupMessage
