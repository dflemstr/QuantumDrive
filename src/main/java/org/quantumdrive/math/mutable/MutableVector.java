package org.quantumdrive.math.mutable;

/**
 * Provides common methods for all n-dimensional mutable vector types
 */
public interface MutableVector<VecN, ImmutableVecN> {
    /**
     * Creates an immutable snapshot of this vector.
     * @return Immutable snapshot of this vector.
     */
    public ImmutableVecN view();

    /**
     * Adds a vector to this vector, storing the result in this vector.
     * @param that Second summand
     */
    public void addLocal(final VecN that);

    /**
     * Adds a vector to this vector, storing the result in this vector.
     * @param that Second summand
     */
    public void $plus$eq(final VecN that);

    /**
     * Subtracts a vector from this vector, storing the result in this vector.
     * @param that Second operand
     */
    public void subtractLocal(final VecN that);

    /**
     * Subtracts a vector from this vector, storing the result in this vector.
     * @param that Second operand
     */
    public void $minus$eq(final VecN that);

    /**
     * Adds a scalar to this vector, storing the result in this vector.
     * @param scalar Second summand
     */
    public void addLocal(final float scalar);

    /**
     * Adds a scalar to this vector, storing the result in this vector.
     * @param scalar Second summand
     */
    public void $plus$eq(final float scalar);

    /**
     * Subtracts a scalar from this vector, storing the result in this vector.
     * @param scalar Second operand
     */
    public void subtractLocal(final float scalar);

    /**
     * Subtracts a scalar from this vector, storing the result in this vector.
     * @param scalar Second operand
     */
    public void $minus$eq(final float scalar);

    /**
     * Scales this vector by a factor, storing the result in this vector.
     * @param scalar Factor
     */
    public void multiplyLocal(final float scalar);

    /**
     * Scales this vector by a factor, storing the result in this vector.
     * @param scalar Factor
     */
    public void $times$eq(final float scalar);

    /**
     * Scales this vector by the inverse of a factor, storing the result in this vector.
     * @param scalar Inverse factor
     */
    public void divideLocal(final float scalar);

    /**
     * Scales this vector by the inverse of a factor, storing the result in this vector.
     * @param scalar Inverse factor
     */
    public void $div$eq(final float scalar);

    /**
     * Caluclates this vector's normalized form (with length 1) and updates this vector with the result.
     */
    public void normalize();

    /**
     * Negates the components of this vector, storing the result in this vector.
     */
    public void negate();

    /**
     * Makes all of this vector's components become positive.
     */
    public void makeAbsolute();
}
