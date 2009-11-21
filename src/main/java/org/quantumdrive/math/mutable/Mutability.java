package org.quantumdrive.math.mutable;

/**
 * Marks something as being convertible to a mutable version of itself
 */
public interface Mutability<T> {
    /**
     * Returns a mutable copy of this.
     * @return A mutable copy of this.
     */
    public T mutable();
}
