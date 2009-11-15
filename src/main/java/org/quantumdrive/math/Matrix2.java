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
    public float getC11();
    
    /**
     * The matrixes value at (0, 1)
     */
    public float getC12();

    /**
     * The matrixes value at (1, 0)
     */
    public float getC21();

    /**
     * The matrixes value at (1, 1)
     */
    public float getC22();

    /**
     * The matrixes value at (0, 0)
     */
    public float c11();

    /**
     * The matrixes value at (0, 1)
     */
    public float c12();

    /**
     * The matrixes value at (1, 0)
     */
    public float c21();

    /**
     * The matrixes value at (1, 1)
     */
    public float c22();
}
