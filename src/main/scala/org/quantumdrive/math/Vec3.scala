package org.quantumdrive.math

import org.quantumdrive.math.immutable.ImmutableVector3
import org.quantumdrive.math.immutable.Vec3Impl

/**
 * Singleton object with factory methods for creating immutable 3-dimensional vectors.
 */
object Vec3 {
  def apply(x: Float, y: Float, z: Float): ImmutableVector3 = new Vec3Impl(x, y, z)
  def unapply(value: ImmutableVector3) = Some((value.x, value.y, value.z))
}
