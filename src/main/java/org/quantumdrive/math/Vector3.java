package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableVector3;

/**
 * Describes a concrete 3-dimensional vector.
 */
public interface Vector3 extends Vector<Vector3, ImmutableVector3> {
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
    
    /**
     * @return The y-component of this vector.
     */
    public float getZ();

    /**
     * @return The y-component of this vector.
     */
    public float z();
}
