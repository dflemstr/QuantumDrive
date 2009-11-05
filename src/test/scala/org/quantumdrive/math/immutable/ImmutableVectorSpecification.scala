package org.quantumdrive.math.immutable

import org.specs._
import org.specs.runner.JUnit4
import org.quantumdrive.math.Utils._

class ImmutableVectorTest extends JUnit4(ImmutableVectorSpecification)

object ImmutableVectorSpecification extends Specification {

  "An immutable 3D vector" should {
    "support basic arithmetic" in {
      var result = Vec3(1, 2, 3) + Vec3(1.1f, 2.2f, 3.3f)
      result must beWithinEpsilonOf (Vec3(2.1f, 4.2f, 6.3f))
      result -= Vec3(1.1f, 2.2f, 3.3f)
      result must beWithinEpsilonOf (Vec3(1, 2, 3))
      (result dot Vec3(2, 4, 6)) must_== (28.0f)
    }
    "support scalar arithmetic" in {
      var result = Vec3(1, 2, 3) * 4
      result must beWithinEpsilonOf (Vec3(4, 8, 12))
      result += 2
      result must beWithinEpsilonOf (Vec3(6, 10, 14))
      result /= 2
      result must beWithinEpsilonOf (Vec3(3, 5, 7))
      result -= 1
      result must beWithinEpsilonOf (Vec3(2, 4, 6))
    }
    "be normalizationable" in {
      Vec3(4, 2, 4).asNormal must beWithinEpsilonOf (Vec3(2/3f, 1/3f, 2/3f))
    }
    "be negatiable in any direction" in {
      -Vec3(1, 2, 3) must beWithinEpsilonOf (Vec3(-1, -2, -3))
      Vec3(-1, -2, -3).absolute must beWithinEpsilonOf (Vec3(1, 2, 3))
    }
  }

  "An immutable 2D vector" should {
    "support basic arithmetic" in {
      var result = Vec2(1, 2) + Vec2(1.1f, 2.2f)
      result must beWithinEpsilonOf (Vec2(2.1f, 4.2f))
      result -= Vec2(1.1f, 2.2f)
      result must beWithinEpsilonOf (Vec2(1, 2))
      (result dot Vec2(2, 4)) must beLessThan (10f + Epsilon) and beGreaterThan (10f - Epsilon)
    }
    "support scalar arithmetic" in {
      var result = Vec2(1, 2) * 4
      result must beWithinEpsilonOf (Vec2(4, 8))
      result += 2
      result must beWithinEpsilonOf (Vec2(6, 10))
      result /= 2
      result must beWithinEpsilonOf (Vec2(3, 5))
      result -= 1
      result must beWithinEpsilonOf (Vec2(2, 4))
    }
    "be normalizationable" in {
      Vec2(3, 4).asNormal must beWithinEpsilonOf (Vec2(0.6f, 0.8f))
    }
    "be negatiable in any direction" in {
      -Vec2(1, 2) must beWithinEpsilonOf (Vec2(-1, -2))
      Vec2(-1, 2).absolute must beWithinEpsilonOf (Vec2(1, 2))
    }
  }
}
