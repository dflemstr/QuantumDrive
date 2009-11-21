package org.quantumdrive.math.mutable

import org.quantumdrive.math.Vector2
import org.quantumdrive.math.VectorArithmetic2
import org.quantumdrive.math.immutable.Vec2Impl

/**
 * A MutableVector2 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
private[math] final case class MVec2Impl(final var x: Float, final var y: Float)
    extends MutableVector2 with VectorArithmetic2 {

  //Implement the methods from the interface:
  final def view = new Vec2Impl(x, y)

  final def setX(value: Float) = (x = value)

  final def setY(value: Float) = (y = value)

  final def addLocal(that: Vector2) = {
    x += that.getX
    y += that.getY
  }

  final def subtractLocal(that: Vector2) = {
    x -= that.getX
    y -= that.getY
  }

  final def addLocal(scalar: Float) = {
    x += scalar
    y += scalar
  }

  final def subtractLocal(scalar: Float) = {
    x -= scalar
    y -= scalar
  }

  final def multiplyLocal(scalar: Float) = {
    x *= scalar
    y *= scalar
  }

  final def divideLocal(scalar: Float) = {
    x /= scalar
    y /= scalar
  }

  final def normalize = {
    x /= length
    y /= length
  }

  final def negate = {
    x = -x
    y = -y
  }

  final def makeAbsolute = {
    x = Math.abs(x)
    y = Math.abs(y)
  }

  final def +=(that: Vector2) = addLocal(that)
  final def -=(that: Vector2) = subtractLocal(that)

  final def +=(scalar: Float) = addLocal(scalar)
  final def -=(scalar: Float) = subtractLocal(scalar)
  final def *=(scalar: Float) = multiplyLocal(scalar)
  final def /=(scalar: Float) = divideLocal(scalar)
}
