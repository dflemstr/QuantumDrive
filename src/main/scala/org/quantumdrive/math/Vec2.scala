package org.quantumdrive.math

import org.quantumdrive.math.immutable.ImmutableVector2
import org.quantumdrive.math.immutable.Vec2Impl

/**
 * Singleton object with factory methods for creating immutable 2-dimensional vectors.
 */
object Vec2 {
  def apply(x: Float, y: Float): ImmutableVector2 = new Vec2Impl(x, y)
  def unapply(value: ImmutableVector2) = Some((value.x, value.y))
}
