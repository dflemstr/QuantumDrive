package org.quantumdrive.math.immutable

import org.quantumdrive.math.VectorArithmetic2
import org.quantumdrive.math.mutable.MVec2Impl

/**
 * An ImmutableVector2 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
private[math] final case class Vec2Impl(final val x: Float, final val y: Float)
    extends ImmutableVector2 with VectorArithmetic2 {
  final def mutable = new MVec2Impl(x, y)
}
