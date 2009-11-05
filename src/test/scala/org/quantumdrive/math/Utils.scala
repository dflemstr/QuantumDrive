package org.quantumdrive.math

import org.specs.matcher.Matcher

object Utils {
  /** The max error accepted in the result of an operation */
  val Epsilon = 1e-3f

  def beWithinEpsilonOf(value: VectorArithmetic3) = new Matcher[VectorArithmetic3] {
    val min = value - Epsilon
    val max = value + Epsilon
    def apply(v: => VectorArithmetic3) =
      (v.x < max.x && v.y < max.y && v.z < max.z && v.x > min.x && v.y > min.y && v.z > min.z,
       v + " is close enough to " + value,
       v + " is too far away from expected result " + value)
  }

  def beWithinEpsilonOf(value: VectorArithmetic2) = new Matcher[VectorArithmetic2] {
    def apply(v: => VectorArithmetic2) = {
      val min = value - Epsilon
      val max = value + Epsilon
      (v.x < max.x && v.y < max.y && v.x > min.x && v.y > min.y,
       v + " is close enough to " + value,
       v + " is too far away from expected result " + value)
    }
  }
}
