package org.quantumdrive.math.mutable;

import org.quantumdrive.math.Matrix2;
import org.quantumdrive.math.immutable.ImmutableMatrix2;

/**
 * Represents a 2-by-2 matrix that can be mutated (changed).
 * This is used for situations where you need to change a matrix frequently,
 * and thus want to avoid creating new matrices for every operation.
 * <br/>
 * Use ImmutableMatrix2.mutable() to generate a mutable matrix.
 */
public interface MutableMatrix2 extends Matrix2, MutableMatrix<Matrix2, ImmutableMatrix2> {
    /**
     * Sets the matrixes value at (0, 0)
     */
    public void setC11(final float value);

    /**
     * Sets the matrixes value at (0, 1)
     */
    public void setC12(final float value);

    /**
     * Sets the matrixes value at (1, 0)
     */
    public void setC21(final float value);

    /**
     * Sets the matrixes value at (1, 1)
     */
    public void setC22(final float value);

    /**
     * Sets the matrixes value at (0, 0)
     */
    public void c11_$eq(final float value);

    /**
     * Sets the matrixes value at (0, 1)
     */
    public void c12_$eq(final float value);

    /**
     * Sets the matrixes value at (1, 0)
     */
    public void c21_$eq(final float value);

    /**
     * Sets the matrixes value at (1, 1)
     */
    public void c22_$eq(final float value);
}
