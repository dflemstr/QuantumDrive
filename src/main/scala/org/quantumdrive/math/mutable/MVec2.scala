package org.quantumdrive.math.mutable

import org.quantumdrive.math.Vector2
import org.quantumdrive.math.VectorArithmetic2
import org.quantumdrive.math.immutable.Vec2

/**
 * A MutableVector2 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
case class MVec2(var x: Float, var y: Float) extends MutableVector2 with VectorArithmetic2 {

  //Implement the methods from the interface:
  def view = new Vec2(x, y)

  def addLocal(that: Vector2) = {
    x += that.getX
    y += that.getY
  }

  def subtractLocal(that: Vector2) = {
    x -= that.getX
    y -= that.getY
  }

  def addLocal(scalar: Float) = {
    x += scalar
    y += scalar
  }

  def subtractLocal(scalar: Float) = {
    x -= scalar
    y -= scalar
  }

  def multiplyLocal(scalar: Float) = {
    x *= scalar
    y *= scalar
  }

  def divideLocal(scalar: Float) = {
    x /= scalar
    y /= scalar
  }

  def normalize = {
    x /= length
    y /= length
  }

  def negate = {
    x = -x
    y = -y
  }

  def makeAbsolute = {
    x = Math.abs(x)
    y = Math.abs(y)
  }
}
