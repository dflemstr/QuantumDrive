package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableVector2;

/**
 * Describes a concrete 2-dimensional vector.
 */
public interface Vector2 extends Vector<Vector2, ImmutableVector2> {
    /**
     * @return The x-component of this vector.
     */
    public float getX();

    /**
     * @return The x-component of this vector.
     */
    public float x();

    /**
     * @return The y-component of this vector.
     */
    public float getY();

    /**
     * @return The y-component of this vector.
     */
    public float y();
}
