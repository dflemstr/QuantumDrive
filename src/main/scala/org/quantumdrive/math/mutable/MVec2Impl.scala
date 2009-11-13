package org.quantumdrive.math.mutable

import org.quantumdrive.math.Vector2
import org.quantumdrive.math.VectorArithmetic2
import org.quantumdrive.math.immutable.Vec2Impl

/**
 * A MutableVector2 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
private[math] case class MVec2Impl(var x: Float, var y: Float) extends MutableVector2 with VectorArithmetic2 {

  //Implement the methods from the interface:
  def view = new Vec2Impl(x, y)

  def setX(value: Float) = (x = value)

  def setY(value: Float) = (y = value)

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

  def +=(that: Vector2) = addLocal(that)
  def -=(that: Vector2) = subtractLocal(that)

  def +=(scalar: Float) = addLocal(scalar)
  def -=(scalar: Float) = subtractLocal(scalar)
  def *=(scalar: Float) = multiplyLocal(scalar)
  def /=(scalar: Float) = divideLocal(scalar)
}
