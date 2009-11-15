package org.quantumdrive.math.immutable;

import org.quantumdrive.math.Matrix3;
import org.quantumdrive.math.mutable.MutableMatrix3;

/**
 * Represents a 3-by-3 matrix that cannot be mutated (changed).
 * This is used for situations where multiple threads need to access the matrix
 * simultaneously, or when the matrix might have to be sent over a network.
 * The default should be to use immutable matrices wherever possible.
 * <br/>
 * Use MutableMatrix3.view() to generate an immutable matrix.
 */
public interface ImmutableMatrix3 extends Matrix3, ImmutableMatrix<Matrix3, MutableMatrix3> {}
