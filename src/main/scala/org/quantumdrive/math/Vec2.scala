package org.quantumdrive.math

import org.quantumdrive.math.immutable.ImmutableVector2
import org.quantumdrive.math.immutable.Vec2Impl

/**
 * Singleton object with factory methods for creating immutable 2-dimensional vectors.
 */
object Vec2 {
  final def apply(x: Float, y: Float): ImmutableVector2 = new Vec2Impl(x, y)
  final def unapply(value: Vector2) = Some((value.x, value.y))

  final val One = Vec2(1, 1)
  final val Zero = Vec2(0, 0)
}
