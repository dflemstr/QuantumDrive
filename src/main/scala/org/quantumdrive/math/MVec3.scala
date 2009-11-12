package org.quantumdrive.math

import org.quantumdrive.math.mutable.MVec3Impl
import org.quantumdrive.math.mutable.MutableVector3

/**
 * Singleton object with factory methods for creating mutable 3-dimensional vectors.
 */
object MVec3 {
  def apply(x: Float, y: Float, z: Float): MutableVector3 = new MVec3Impl(x, y, z)
  def unapply(value: MutableVector3) = Some((value.x, value.y, value.z))
}
