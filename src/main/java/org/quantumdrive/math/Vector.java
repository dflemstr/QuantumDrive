package org.quantumdrive.math;

/**
 * A concrete vector implementation of any dimension.
 */
public interface Vector<VecN, ImmutableVecN> {

    /**
     * The number of covered spatial dimensions this vector has.
     * @return Dimension number
     */
    public float dimension();

    /**
     * Adds another vector to this vector, returning a new vector (this vector isn't modified).
     * @param that Second summand
     * @return Sum
     */
    public ImmutableVecN add(final VecN that);
    
    /**
     * Adds another vector to this vector, returning a new vector (this vector isn't modified).
     * @param that Second summand
     * @return Sum
     */
    public ImmutableVecN $plus(final VecN that);

    /**
     * Subtracts another vector from this vector, returning a new vector (this vector isn't modified).
     * @param that Second operand
     * @return Difference
     */
    public ImmutableVecN subtract(final VecN that);
    
    /**
     * Subtracts another vector from this vector, returning a new vector (this vector isn't modified).
     * @param that Second operand
     * @return Difference
     */
    public ImmutableVecN $minus(final VecN that);

    /**
     * Adds a scalar to this vector, essentially adding the value to all of the vector components. Returns a new vector.
     * @param scalar Second summand
     * @return Sum
     */
    public ImmutableVecN add(final float scalar);
    
    /**
     * Adds a scalar to this vector, essentially adding the value to all of the vector components. Returns a new vector.
     * @param scalar Second summand
     * @return Sum
     */
    public ImmutableVecN $plus(final float scalar);

    /**
     * Subtracts a scalar from this vector, essentially subtracting the value from all vector components. Returns a new vector.
     * @param scalar Second operand
     * @return Difference
     */
    public ImmutableVecN subtract(final float scalar);

    /**
     * Subtracts a scalar from this vector, essentially subtracting the value from all vector components. Returns a new vector.
     * @param scalar Second operand
     * @return Difference
     */
    public ImmutableVecN $minus(final float scalar);
    
    /**
     * Scales this vector by a factor. Returns a new vector.
     * @param scalar Factor
     * @return Scaled vector
     */
    public ImmutableVecN multiply(final float scalar);

    /**
     * Scales this vector by a factor. Returns a new vector.
     * @param scalar Factor
     * @return Scaled vector
     */
    public ImmutableVecN $times(final float scalar);

    /**
     * Scales this vector by a factor. Is essentially the same as this * (1 / scalar).
     * @param scalar factor
     * @return Scaled vector
     */
    public ImmutableVecN divide(final float scalar);

    /**
     * Scales this vector by a factor. Is essentially the same as this * (1 / scalar).
     * @param scalar factor
     * @return Scaled vector
     */
    public ImmutableVecN $div(final float scalar);

    /**
     * Calculates the dot product for this vector times another vector.
     * @param that Other vector
     * @return Dot product
     */
    public float dot(final VecN that);

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
    public ImmutableVecN asNormal();

    /**
     * Negates the components of this vector.
     * @return This vector's negative
     */
    public ImmutableVecN negative();

    /**
     * Negates the components of this vector.
     * @return This vector's negative
     */
    public ImmutableVecN unary_$minus();

    /**
     * Returns a vector using the absolute values of this vector's components.
     * @return This vector's absolute
     */
    public ImmutableVecN absolute();
    
    /**
     * Returns a vector using the absolute values of this vector's components.
     * @return This vector's absolute
     */
    public ImmutableVecN abs();
}
