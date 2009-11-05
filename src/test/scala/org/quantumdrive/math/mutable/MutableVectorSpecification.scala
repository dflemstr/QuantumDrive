package org.quantumdrive.math.mutable

import org.specs._
import org.specs.runner.JUnit4
import org.quantumdrive.math.Utils._
import org.quantumdrive.math.immutable.Vec3

class ImmutableVectorTest extends JUnit4(MutableVectorSpecification)

object MutableVectorSpecification extends Specification {

  "A mutable 3D vector" should {
    "support basic in-place arithmetic" in {
      val result = MVec3(3, 4, 5)
      result -= MVec3(1, 2, 3)
      result must beWithinEpsilonOf(Vec3(2, 2, 2))
      result /= 3
      result must beWithinEpsilonOf(Vec3(2/3f, 2/3f, 2/3f))
    }
  }
}
