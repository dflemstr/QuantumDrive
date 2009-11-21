package org.quantumdrive.math

import org.quantumdrive.math.mutable.MVec2Impl
import org.quantumdrive.math.mutable.MutableVector2

/**
 * Singleton object with factory methods for creating mutable 2-dimensional vectors.
 */
object MVec2 {
  final def apply(x: Float, y: Float): MutableVector2 = new MVec2Impl(x, y)
  final def unapply(value: MutableVector2) = Some((value.x, value.y))
}
