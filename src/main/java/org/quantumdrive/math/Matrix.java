package org.quantumdrive.math;

/**
 * A concrete matrix implementation for any square matrix type
 */
public interface Matrix<MatN, VecN, ImmutableMatN, ImmutableVecN> {

    /**
     * This matrixes dimesion. A matrix implementing this interface has to be a
     * square matrix, sot he size of the matrix will always be dimension*dimension.
     * @return Dimension number
     */
    public float dimension();

    /**
     * This matrixes determinant.
     * @return The determinant
     */
    public float determinant();

    /**
     * Accesses the element (x,y) of the matrix.
     * @param x Column to access
     * @param y Row to access
     * @return Value at the column x and row y
     * @throws ArrayIndexOutOfBoundsException when x or y are outside [0; dimension - 1]
     */
    public float apply(final int x, final int y) throws ArrayIndexOutOfBoundsException;

    /**
     * Accesses the element (x,y) of the matrix.
     * @param x Column to access
     * @param y Row to access
     * @return Value at the column x and row y
     * @throws ArrayIndexOutOfBoundsException when x or y are outside [0; dimension - 1]
     */
    public float getC(final int x, final int y) throws ArrayIndexOutOfBoundsException;

    /**
     * Adds a scalar to each element of this matrix
     * @param scalar Scalar to add
     * @return Adjusted matrix
     */
    public ImmutableMatN add(final float scalar);

    /**
     * Adds a scalar to each element of this matrix
     * @param scalar Scalar to add
     * @return Adjusted matrix
     */
    public ImmutableMatN $plus(final float scalar);

    /**
     * Subtracts a scalar from each element of this matrix
     * @param scalar Scalar to subtract
     * @return Adjusted matrix
     */
    public ImmutableMatN subtract(final float scalar);

    /**
     * Subtracts a scalar from each element of this matrix
     * @param scalar Scalar to subtract
     * @return Adjusted matrix
     */
    public ImmutableMatN $minus(final float scalar);

    /**
     * Scales this matrix by a given scalar
     * @param scalar Scalar
     * @return Adjusted matrix
     */
    public ImmutableMatN multiply(final float scalar);

    /**
     * Scales this matrix by a given scalar
     * @param scalar Scalar
     * @return Adjusted matrix
     */
    public ImmutableMatN $times(final float scalar);

    /**
     * Scales this matrix by the inverse of a given scalar
     * @param scalar Scalar
     * @return Adjusted matrix
     */
    public ImmutableMatN divide(final float scalar);

    /**
     * Scales this matrix by the inverse of a given scalar
     * @param scalar Scalar
     * @return Adjusted matrix
     */
    public ImmutableMatN $div(final float scalar);

    /**
     * Adds a matrix to this matrix, element-by-element.
     * @param matrix The matrix to add
     * @return Adjusted matrix
     */
    public ImmutableMatN add(final MatN matrix);

    /**
     * Adds a matrix to this matrix, element-by-element.
     * @param matrix The matrix to add
     * @return Adjusted matrix
     */
    public ImmutableMatN $plus(final MatN matrix);

    /**
     * Multiplies this matrix by another matrix
     * @param matrix The matrix to multiply by
     * @return Adjusted matrix
     */
    public ImmutableMatN multiply(final MatN matrix);

    /**
     * Multiplies this matrix by another matrix
     * @param matrix The matrix to multiply by
     * @return Adjusted matrix
     */
    public ImmutableMatN $times(final MatN matrix);

    /**
     * Multiplies the transpose of this matrix by another matrix
     * @param matrix The matrix to multiply by
     * @return Adjusted matrix
     */
    public ImmutableMatN multiplyTranspose(final MatN matrix);

    /**
     * Transforms (multiplies) the given vector using this matrix.
     * @param value The vector to transform
     * @return Transformed vector
     */
    public ImmutableVecN transform(final VecN value);

    /**
     * Transforms (multiplies) the given vector using the transpose of this matrix.
     * @param value The vector to transform
     * @return Transformed vector
     */
    public ImmutableVecN transformTranspose(final VecN value);

    /**
     * Transposes this matrix
     * @return A transposed version of this matrix
     */
    public ImmutableMatN transpose();

    /**
     * Generates the absolute of this matrix
     * @return A negated version of this matrix
     */
    public ImmutableMatN absolute();

    /**
     * Negates this matrix
     * @return A negated version of this matrix
     */
    public ImmutableMatN negative();

    /**
     * Inverts this matrix
     * @return An inverse version of this matrix
     */
    public ImmutableMatN inverse();
}
