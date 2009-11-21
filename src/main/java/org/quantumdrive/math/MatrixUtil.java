package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableMatrix2;
import org.quantumdrive.math.immutable.ImmutableMatrix3;
import org.quantumdrive.math.immutable.Mat2Impl;
import org.quantumdrive.math.immutable.Mat3Impl;
import org.quantumdrive.math.mutable.MMat2Impl;
import org.quantumdrive.math.mutable.MMat3Impl;
import org.quantumdrive.math.mutable.MutableMatrix2;
import org.quantumdrive.math.mutable.MutableMatrix3;

/**
 * Various matrix-related utility methods. Contains factory methods for matrices.
 */
public class MatrixUtil {
    /**
     * Creates a new 2x2 matrix
     * @param c00 The top left cell
     * @param c10 The top right cell
     * @param c01 The bottom left cell
     * @param c11 The bottom right cell
     * @return A constructed matrix
     */
    public static ImmutableMatrix2 createMatrix(final float c00, final float c10,
                                                final float c01, final float c11) {
        return new Mat2Impl(c00, c10, c01, c11);
    }

    /**
     * Creates a new 3x3 matrix
     * @param c00 The top left cell
     * @param c10 The top middle cell
     * @param c20 The top right cell
     * @param c01 The middle left cell
     * @param c11 The center cell
     * @param c21 The middle right cell
     * @param c02 The bottom left cell
     * @param c12 The bottom middle cell
     * @param c22 The bottom right cell
     * @return A constructed matrix
     */
    public static ImmutableMatrix3 createMatrix(final float c00, final float c10, final float c20,
                                                final float c01, final float c11, final float c21,
                                                final float c02, final float c12, final float c22) {
        return new Mat3Impl(c00, c10, c20, c01, c11, c21, c02, c12, c22);
    }

    /**
     * Creates a new 3x3 matrix
     * @param c00 The top left cell
     * @param c10 The top middle cell
     * @param c20 The top right cell
     * @param c01 The middle left cell
     * @param c11 The center cell
     * @param c21 The middle right cell
     * @param c02 The bottom left cell
     * @param c12 The bottom middle cell
     * @param c22 The bottom right cell
     * @return A constructed matrix
     */
    public static ImmutableMatrix3 Mat3(final float c00, final float c10, final float c20,
                                        final float c01, final float c11, final float c21,
                                        final float c02, final float c12, final float c22) {
        return new Mat3Impl(c00, c10, c20, c01, c11, c21, c02, c12, c22);
    }

    /**
     * Creates a new mutable 3x3 matrix
     * @param c00 The top left cell
     * @param c10 The top middle cell
     * @param c20 The top right cell
     * @param c01 The middle left cell
     * @param c11 The center cell
     * @param c21 The middle right cell
     * @param c02 The bottom left cell
     * @param c12 The bottom middle cell
     * @param c22 The bottom right cell
     * @return A constructed matrix
     */
    public static MutableMatrix3 MMat3(final float c00, final float c10, final float c20,
                                       final float c01, final float c11, final float c21,
                                       final float c02, final float c12, final float c22) {
        return new MMat3Impl(c00, c10, c20, c01, c11, c21, c02, c12, c22);
    }

    /**
     * Creates a new 2x2 matrix
     * @param c00 The top left cell
     * @param c10 The top right cell
     * @param c01 The bottom left cell
     * @param c11 The bottom right cell
     * @return A constructed matrix
     */
    public static ImmutableMatrix2 Mat2(final float c00, final float c10,
                                        final float c01, final float c11) {
        return new Mat2Impl(c00, c10, c01, c11);
    }

    /**
     * Creates a new 2x2 mutable matrix
     * @param c00 The top left cell
     * @param c10 The top right cell
     * @param c01 The bottom left cell
     * @param c11 The bottom right cell
     * @return A constructed matrix
     */
    public static MutableMatrix2 MMat2(final float c00, final float c10,
                                       final float c01, final float c11) {
        return new MMat2Impl(c00, c10, c01, c11);
    }
}
