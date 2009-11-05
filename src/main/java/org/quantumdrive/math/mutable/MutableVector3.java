package org.quantumdrive.math.mutable;

import org.quantumdrive.math.Vector3;
import org.quantumdrive.math.immutable.ImmutableVector3;

/**
 * Represents a 3-dimensional vector that can be mutated (changed).
 * This is used for situations where you need to change a vector frequently,
 * and thus want to avoid creating new vectors for every operation.
 * <br/>
 * Use ImmutableVector3.mutable() to generate a mutable vector.
 */
public interface MutableVector3 extends Vector3, Cloneable {
    public ImmutableVector3 view();
    
    public void addLocal(final Vector3 that);
    public void subtractLocal(final Vector3 that);
    public void addLocal(final float scalar);
    public void subtractLocal(final float scalar);
    public void multiplyLocal(final float scalar);
    public void divideLocal(final float scalar);

    public void normalize();
    public void negate();
    public void makeAbsolute();
}
