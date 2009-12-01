package org.quantumdrive.core;

import scala.actors.OutputChannel;

/**
 * A player that the core can interact with
 */
public interface Player {
    /**
     * The name of the player
     * @return The human-readable name of the player
     */
    public String getName();

    /**
     * The players identifier; must be unique to the current session
     * @return the machine-readable identifier of the player
     */
    public String getId();

    /**
     * This should produce the OutputChannel that the core should send messages to.
     * This method has to return the same OutputChannel every time.
     * @return an instance of an OutputChannel that is used for message passing.
     */
    public OutputChannel<Object> getChannel();
}
