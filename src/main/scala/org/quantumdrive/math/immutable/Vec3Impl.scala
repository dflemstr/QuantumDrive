package org.quantumdrive.math.immutable

import org.quantumdrive.math.VectorArithmetic3
import org.quantumdrive.math.mutable.MVec3Impl

/**
 * An ImmutableVector3 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
private[math] final case class Vec3Impl(final val x: Float, final val y: Float, final val z: Float)
    extends ImmutableVector3 with VectorArithmetic3 {
  final def mutable = new MVec3Impl(x, y, z)
}