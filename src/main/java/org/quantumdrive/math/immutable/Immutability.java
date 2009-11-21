package org.quantumdrive.math.immutable;

/**
 * Marks something as being convertible to an immutable version of itself
 */
public interface Immutability<T> {

    /**
     * Creates an immutable snapshot of this.
     * @return Immutable snapshot of this
     */
    public T view();
}
