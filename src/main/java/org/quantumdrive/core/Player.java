package org.quantumdrive.core;

import scala.actors.Actor;

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
     * This should produce the Actor that the core should send messages to.
     * This method has to return the same actor every time.
     * @return an instance of an Actor that is used for message passing.
     */
    public Actor getActor();
}
