package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableVector2;

/**
 * Describes a concrete 2-dimensional vector.
 */
public interface Vector2 {
    /**
     * @return The x-component of this vector.
     */
    public float getX();

    /**
     * @return The y-component of this vector.
     */
    public float getY();

    public ImmutableVector2 add(final Vector2 that);
    public ImmutableVector2 subtract(final Vector2 that);
    
    public ImmutableVector2 add(final float scalar);
    public ImmutableVector2 subtract(final float scalar);
    public ImmutableVector2 multiply(final float scalar);
    public ImmutableVector2 divide(final float scalar);
    
    public float dot(final Vector2 that);

    public float length();
    public float lengthSquared();

    public ImmutableVector2 asNormal();
    public ImmutableVector2 negative();
    public ImmutableVector2 absolute();
}
