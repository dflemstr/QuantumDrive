package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableMatrix2;
import org.quantumdrive.math.immutable.ImmutableVector2;

/**
 * Describes a concrete 2-dimensional matrix.
 */
public interface Matrix2 extends Matrix<Matrix2, Vector2, ImmutableMatrix2, ImmutableVector2> {
    /**
     * The matrixes value at (0, 0)
     */
    public float getC00();

    /**
     * The matrixes value at (0, 1)
     */
    public float getC01();

    /**
     * The matrixes value at (1, 0)
     */
    public float getC10();

    /**
     * The matrixes value at (1, 1)
     */
    public float getC11();

    /**
     * The matrixes value at (0, 0)
     */
    public float c00();

    /**
     * The matrixes value at (0, 1)
     */
    public float c01();

    /**
     * The matrixes value at (1, 0)
     */
    public float c10();

    /**
     * The matrixes value at (1, 1)
     */
    public float c11();
}
