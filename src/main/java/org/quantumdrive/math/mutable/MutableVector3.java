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
public interface MutableVector3 extends Vector3, MutableVector<Vector3, ImmutableVector3>, Cloneable {

    /**
     * Changes the value of this vector's X element.
     * @param value New value.
     */
    public void setX(final float value);

    /**
     * Changes the value of this vector's X element.
     * @param value New value.
     */
    public void x_$eq(final float value);

    /**
     * Changes the value of this vector's Y element.
     * @param value New value.
     */
    public void setY(final float value);

    /**
     * Changes the value of this vector's Y element.
     * @param value New value.
     */
    public void y_$eq(final float value);

    /**
     * Changes the value of this vector's Z element.
     * @param value New value.
     */
    public void setZ(final float value);

    /**
     * Changes the value of this vector's Z element.
     * @param value New value.
     */
    public void z_$eq(final float value);
}
