package org.quantumdrive.math

import org.quantumdrive.math.immutable.{Vec2 => ActualVec2}

object Vec2 {
  def apply(x: Float, y: Float) = new ActualVec2(x, y)
}
