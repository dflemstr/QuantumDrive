package org.quantumdrive.math.immutable;

import org.quantumdrive.math.Matrix2;
import org.quantumdrive.math.mutable.MutableMatrix2;

/**
 * Represents a 2-by-2 matrix that cannot be mutated (changed).
 * This is used for situations where multiple threads need to access the matrix
 * simultaneously, or when the matrix might have to be sent over a network.
 * The default should be to use immutable matrices wherever possible.
 * <br/>
 * Use MutableMatrix2.view() to generate an immutable matrix.
 */
public interface ImmutableMatrix2 extends Matrix2, ImmutableMatrix<Matrix2, MutableMatrix2> {}
