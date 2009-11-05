package org.quantumdrive.math;

import org.quantumdrive.math.immutable.ImmutableVector2;
import org.quantumdrive.math.immutable.ImmutableVector3;
import org.quantumdrive.math.immutable.Vec2;
import org.quantumdrive.math.immutable.Vec3;
import org.quantumdrive.math.mutable.MutableVector2;
import org.quantumdrive.math.mutable.MutableVector3;
import org.quantumdrive.math.mutable.MVec2;
import org.quantumdrive.math.mutable.MVec3;

/**
 * Various vector-related utility methods. Contains factory methods for vectors.
 */
public class VectorUtil {
    /**
     * Creates a new 2-dimensional vector.
     * @param x The vector's value in the positive x direction
     * @param y The vector's value in the positive y direction
     * @return A constructed vector
     */
    public static ImmutableVector2 createVector(final float x, final float y) {
        return new Vec2(x, y);
    }

    /**
     * Creates a new 3-dimensional vector.
     * @param x The vector's value in the positive x direction
     * @param y The vector's value in the positive y direction
     * @param z The vector's value in the positive z direction
     * @return A constructed vector
     */
    public static ImmutableVector3 createVector(final float x, final float y, final float z) {
        return new Vec3(x, y, z);
    }

    /**
     * Creates a new 2-dimensional vector. An alternative to createVector.
     * @param x The vector's value in the positive x direction
     * @param y The vector's value in the positive y direction
     * @return A constructed vector
     */
    public static ImmutableVector2 Vec2(final float x, final float y) {
        return new Vec2(x, y);
    }

    /**
     * Creates a new 2-dimensional mutable vector. An alternative to createVector.
     * @param x The vector's value in the positive x direction
     * @param y The vector's value in the positive y direction
     * @return A constructed vector
     */
    public static MutableVector2 MVec2(final float x, final float y, final float z) {
        return new MVec2(x, y);
    }

    /**
     * Creates a new 3-dimensional vector.
     * @param x The vector's value in the positive x direction
     * @param y The vector's value in the positive y direction
     * @param z The vector's value in the positive z direction
     * @return A constructed vector
     */
    public static ImmutableVector3 Vec3(final float x, final float y, final float z) {
        return new Vec3(x, y, z);
    }

    /**
     * Creates a new 3-dimensional mutable vector.
     * @param x The vector's value in the positive x direction
     * @param y The vector's value in the positive y direction
     * @param z The vector's value in the positive z direction
     * @return A constructed vector
     */
    public static MutableVector3 MVec3(final float x, final float y, final float z) {
        return new MVec3(x, y, z);
    }
}
