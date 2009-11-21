package org.quantumdrive.math.mutable;

import org.quantumdrive.math.Matrix3;
import org.quantumdrive.math.immutable.ImmutableMatrix3;

/**
 * Represents a 3-by-3 matrix that can be mutated (changed).
 * This is used for situations where you need to change a matrix frequently,
 * and thus want to avoid creating new matrices for every operation.
 * <br/>
 * Use ImmutableMatrix3.mutable() to generate a mutable matrix.
 */
public interface MutableMatrix3 extends Matrix3, MutableMatrix<Matrix3, ImmutableMatrix3> {
    /**
     * The matrixes value at (0, 0)
     */
    public void setC00(final float value);

    /**
     * The matrixes value at (0, 1)
     */
    public void setC01(final float value);

    /**
     * The matrixes value at (0, 2)
     */
    public void setC02(final float value);

    /**
     * The matrixes value at (1, 0)
     */
    public void setC10(final float value);

    /**
     * The matrixes value at (1, 1)
     */
    public void setC11(final float value);

    /**
     * The matrixes value at (1, 2)
     */
    public void setC12(final float value);

    /**
     * The matrixes value at (2, 0)
     */
    public void setC20(final float value);

    /**
     * The matrixes value at (2, 1)
     */
    public void setC21(final float value);

    /**
     * The matrixes value at (2, 2)
     */
    public void setC22(final float value);

    /**
     * The matrixes value at (0, 0)
     */
    public void c00_$eq(final float value);

    /**
     * The matrixes value at (0, 1)
     */
    public void c01_$eq(final float value);

    /**
     * The matrixes value at (0, 2)
     */
    public void c02_$eq(final float value);

    /**
     * The matrixes value at (1, 0)
     */
    public void c10_$eq(final float value);

    /**
     * The matrixes value at (1, 1)
     */
    public void c11_$eq(final float value);

    /**
     * The matrixes value at (1, 2)
     */
    public void c12_$eq(final float value);

    /**
     * The matrixes value at (2, 0)
     */
    public void c20_$eq(final float value);

    /**
     * The matrixes value at (2, 1)
     */
    public void c21_$eq(final float value);

    /**
     * The matrixes value at (2, 2)
     */
    public void c22_$eq(final float value);
}
