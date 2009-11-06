package org.quantumdrive.math

import org.quantumdrive.math.immutable.{Vec3 => ActualVec3}

object Vec3 {
  def apply(x: Float, y: Float, z: Float) = new ActualVec3(x, y, z)
}
