package org.quantumdrive.math.immutable;

import org.quantumdrive.math.Vector2;
import org.quantumdrive.math.mutable.MutableVector2;

/**
 * Represents a 2-dimensional vector that cannot be mutated (changed).
 * This is used for situations where multiple threads need to access the vector
 * simultaneously, or when the vector might have to be sent over a network.
 * The default should be to use immutable vectors wherever possible.
 * <br/>
 * Use MutableVector2.view() to generate an immutable vector.
 */
public interface ImmutableVector2 extends Vector2 {
    public MutableVector2 mutable();
}
