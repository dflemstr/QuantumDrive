package org.quantumdrive.math.mutable;

import org.quantumdrive.math.Vector2;
import org.quantumdrive.math.immutable.ImmutableVector2;

/**
 * Represents a 2-dimensional vector that can be mutated (changed).
 * This is used for situations where you need to change a vector frequently,
 * and thus want to avoid creating new vectors for every operation.
 * <br/>
 * Use ImmutableVector2.mutable() to generate a mutable vector.
 */
public interface MutableVector2 extends Vector2, Cloneable {
    public ImmutableVector2 view();

    public void addLocal(final Vector2 that);
    public void subtractLocal(final Vector2 that);
    public void addLocal(final float scalar);
    public void subtractLocal(final float scalar);
    public void multiplyLocal(final float scalar);
    public void divideLocal(final float scalar);

    public void normalize();
    public void negate();
    public void makeAbsolute();
}
