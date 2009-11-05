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

    /**
     * Adds another vector to this vector, returning a new vector (this vector isn't modified).
     * @param that Second summand
     * @return Sum
     */
    public ImmutableVector2 add(final Vector2 that);

    /**
     * Subtracts another vector from this vector, returning a new vector (this vector isn't modified).
     * @param that Second operand
     * @return Difference
     */
    public ImmutableVector2 subtract(final Vector2 that);

    /**
     * Adds a scalar to this vector, essentially adding the value to all of the vector components. Returns a new vector.
     * @param scalar Second summand
     * @return Sum
     */
    public ImmutableVector2 add(final float scalar);

    /**
     * Subtracts a scalar from this vector, essentially subtracting the value from all vector components. Returns a new vector.
     * @param scalar Second operand
     * @return Difference
     */
    public ImmutableVector2 subtract(final float scalar);

    /**
     * Scales this vector by a factor. Returns a new vector.
     * @param scalar Factor
     * @return Scaled vector
     */
    public ImmutableVector2 multiply(final float scalar);

    /**
     * Scales this vector by a factor. Is essentially the same as this * (1 / scalar).
     * @param scalar factor
     * @return Scaled vector
     */
    public ImmutableVector2 divide(final float scalar);

    /**
     * Calculates the dot product for this vector times another vector.
     * @param that Other vector
     * @return Dot product
     */
    public float dot(final Vector2 that);

    /**
     * Calculates the length of this vector.
     * @return Length of this vector.
     */
    public float length();

    /**
     * Caluclates the squared length of this vector. This is more efficient than using length()
     * @return Squared length of this vector
     */
    public float lengthSquared();

    /**
     * Caluclates this vector's normalized form (with length 1).
     * @return Normalized form of this vector.
     */
    public ImmutableVector2 asNormal();

    /**
     * Negates the components of this vector.
     * @return This vector's negative
     */
    public ImmutableVector2 negative();

    /**
     * Returns a vector using the absolute values of this vector's components.
     * @return This vector's absolute
     */
    public ImmutableVector2 absolute();
}
