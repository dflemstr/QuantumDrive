package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableVector3;

/**
 * Describes a concrete 3-dimensional vector.
 */
public interface Vector3 {
    public float getX();
    public float getY();
    public float getZ();
    
    public ImmutableVector3 add(final Vector3 that);
    public ImmutableVector3 subtract(final Vector3 that);
    
    public ImmutableVector3 add(final float scalar);
    public ImmutableVector3 subtract(final float scalar);
    public ImmutableVector3 multiply(final float scalar);
    public ImmutableVector3 divide(final float scalar);
    
    public float dot(final Vector3 that);

    public float length();
    public float lengthSquared();

    public ImmutableVector3 asNormal();
    public ImmutableVector3 negative();
    public ImmutableVector3 absolute();
}
