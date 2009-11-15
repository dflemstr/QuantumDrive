package org.quantumdrive.math.mutable;

/**
 * Provides common methods for all n-by-n mutable matrix types
 */
public interface MutableMatrix<MatN, ImmutableMatN> {
    /**
     * Creates an immutable snapshot of this matrix.
     * @return Immutable snapshot of this matrix.
     */
    public ImmutableMatN view();

    /**
     * Changes the value in cell (x,y) of this matrix
     * @param x The column number to change
     * @param y The row number to change
     * @param value The new value for (x,y)
     * @throws IndexOutOfBoundsException when x or y are outside [0; dimension - 1]
     */
    public void update(final int x, final int y, final float value) throws IndexOutOfBoundsException;
    
    /**
     * Changes the value in cell (x,y) of this matrix
     * @param x The column number to change
     * @param y The row number to change
     * @param value The new value for (x,y)
     * @throws IndexOutOfBoundsException when x or y are outside [0; dimension - 1]
     */
    public void setC(final int x, final int y, final float value) throws IndexOutOfBoundsException;

    /**
     * Adds a scalar to this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void addLocal(final float scalar);

    /**
     * Adds a scalar to this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void $plus$eq(final float scalar);

    /**
     * Subtracts a scalar from this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void subtractLocal(final float scalar);

    /**
     * Subtracts a scalar from this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void $minus$eq(final float scalar);

    /**
     * Multiplies a scalar by this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void multiplyLocal(final float scalar);

    /**
     * Multiplies a scalar by this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void $times$eq(final float scalar);

    /**
     * Multipliesthe inverse of a scalar by this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void divideLocal(final float scalar);

    /**
     * Multipliesthe inverse of a scalar by this matrix, storing the result in this matrix
     * @param scalar Operand
     */
    public void $div$eq(final float scalar);

    /**
     * Adds another matrix to this matrix, storing the result in this matrix
     * @param matrix Other matrix
     */
    public void addLocal(final MatN matrix);

    /**
     * Adds another matrix to this matrix, storing the result in this matrix
     * @param matrix Other matrix
     */
    public void $plus$eq(final MatN matrix);

    /**
     * Multiplies this matrix by another matrix, storing the result in this matrix
     * @param matrix Other matrix
     */
    public void multiplyLocal(final MatN matrix);

    /**
     * Multiplies this matrix by another matrix, storing the result in this matrix
     * @param matrix Other matrix
     */
    public void $times$eq(final MatN matrix);

    /**
     * Multiplies the transpose of this matrix by another matrix, storing the result in this matrix
     * @param matrix Other matrix
     */
    public void multiplyTransposeLocal(final MatN matrix);
}
