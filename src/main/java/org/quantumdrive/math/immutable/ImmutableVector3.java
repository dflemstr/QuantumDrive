package org.quantumdrive.math.immutable;

import org.quantumdrive.math.Vector3;
import org.quantumdrive.math.mutable.MutableVector3;

/**
 * Represents a 3-dimensional vector that cannot be mutated (changed).
 * This is used for situations where multiple threads need to access the vector
 * simultaneously, or when the vector might have to be sent over a network.
 * The default should be to use immutable vectors wherever possible.
 * <br/>
 * Use MutableVector3.view() to generate an immutable vector.
 */
public interface ImmutableVector3 extends Vector3 {
    /**
     * Creates a mutable copy of this vector.
     * @return A mutable copy of this vector.
     */
    public MutableVector3 mutable();
}
