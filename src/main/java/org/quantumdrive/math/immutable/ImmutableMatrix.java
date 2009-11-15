package org.quantumdrive.math.immutable;

/**
 * Provides common methods for all n-by-n immutable matrix types
 */
public interface ImmutableMatrix<MatN, MutableMatN> {
    /**
     * Creates a mutable copy of this matrix.
     * @return A mutable copy of this matrix.
     */
    public MutableMatN mutable();
}
