package org.quantumdrive.math.mutable;

import org.quantumdrive.math.Vector2;
import org.quantumdrive.math.immutable.ImmutableVector2;

/**
 * Represents a 2-dimensional vector that can be mutated (changed).
 * This is used for situations where you need to change a vector frequently,
 * and thus want to avoid creating new vectors for every operation.
 * <br/>
 * Use ImmutableVector2.mutable() to generate a mutable vector.
 */
public interface MutableVector2 extends Vector2, Cloneable {
    /**
     * Creates an immutable snapshot of this vector.
     * @return Immutable snapshot of this vector.
     */
    public ImmutableVector2 view();

    /**
     * Changes the value of this vector's X element.
     * @param value New value.
     */
    public void setX(final float value);

    /**
     * Changes the value of this vector's Y element.
     * @param value New value.
     */
    public void setY(final float value);

    /**
     * Adds a vector to this vector, storing the result in this vector.
     * @param that Second summand
     */
    public void addLocal(final Vector2 that);

    /**
     * Subtracts a vector from this vector, storing the result in this vector.
     * @param that Second operand
     */
    public void subtractLocal(final Vector2 that);

    /**
     * Adds a scalar to this vector, storing the result in this vector.
     * @param scalar Second summand
     */
    public void addLocal(final float scalar);

    /**
     * Subtracts a scalar from this vector, storing the result in this vector.
     * @param scalar Second operand
     */
    public void subtractLocal(final float scalar);

    /**
     * Scales this vector by a factor, storing the result in this vector.
     * @param scalar Factor
     */
    public void multiplyLocal(final float scalar);

    /**
     * Scales this vector by the inverse of a factor, storing the result in this vector.
     * @param scalar Inverse factor
     */
    public void divideLocal(final float scalar);

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
