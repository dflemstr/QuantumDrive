package org.quantumdrive.math.immutable;

/**
 * Provides common methods for all n-dimensional immutable vector types
 */
public interface ImmutableVector<VecN, MutableVecN> {
    /**
     * Creates a mutable copy of this vector.
     * @return A mutable copy of this vector.
     */
    public MutableVecN mutable();
}
