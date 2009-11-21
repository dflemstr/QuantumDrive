package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableMatrix3;
import org.quantumdrive.math.immutable.ImmutableVector3;

/**
 * Describes a concrete 3-dimensional matrix.
 */
public interface Matrix3 extends Matrix<Matrix3, Vector3, ImmutableMatrix3, ImmutableVector3> {
    /**
     * The matrixes value at (0, 0)
     */
    public float getC00();

    /**
     * The matrixes value at (0, 1)
     */
    public float getC01();

    /**
     * The matrixes value at (0, 2)
     */
    public float getC02();

    /**
     * The matrixes value at (1, 0)
     */
    public float getC10();

    /**
     * The matrixes value at (1, 1)
     */
    public float getC11();

    /**
     * The matrixes value at (1, 2)
     */
    public float getC12();

    /**
     * The matrixes value at (2, 0)
     */
    public float getC20();

    /**
     * The matrixes value at (2, 1)
     */
    public float getC21();

    /**
     * The matrixes value at (2, 2)
     */
    public float getC22();

    /**
     * The matrixes value at (0, 0)
     */
    public float c00();

    /**
     * The matrixes value at (0, 1)
     */
    public float c01();

    /**
     * The matrixes value at (0, 2)
     */
    public float c02();

    /**
     * The matrixes value at (1, 0)
     */
    public float c10();

    /**
     * The matrixes value at (1, 1)
     */
    public float c11();

    /**
     * The matrixes value at (1, 2)
     */
    public float c12();

    /**
     * The matrixes value at (2, 0)
     */
    public float c20();

    /**
     * The matrixes value at (2, 1)
     */
    public float c21();

    /**
     * The matrixes value at (2, 2)
     */
    public float c22();
}
