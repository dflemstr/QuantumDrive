package org.quantumdrive.math

import org.quantumdrive.math.immutable.ImmutableVector3
import org.quantumdrive.math.immutable.Vec3Impl

/**
 * Singleton object with factory methods for creating immutable 3-dimensional vectors.
 */
object Vec3 {
  final def apply(x: Float, y: Float, z: Float): ImmutableVector3 = new Vec3Impl(x, y, z)
  final def unapply(value: Vector3) = Some((value.x, value.y, value.z))

  final val One = Vec3(1, 1, 1)
  final val Zero = Vec3(0, 0, 0)
}
