package org.quantumdrive.math

import org.quantumdrive.math.immutable.Vec2
import org.quantumdrive.math.mutable.MVec2

/**
 * Implements arithmetic that's used in both mutable vectors and immutable vectors.
 */
trait VectorArithmetic2 extends Vector2 {
  //Abstract:
  def x: Float
  def y: Float

  //Implement the methods from the interface:
  def mutable = new MVec2(x, y)

  def getX = x
  def getY = y

  def add(that: Vector2) = new Vec2(this.x + that.getX, this.y + that.getY)
  def subtract(that: Vector2) = new Vec2(this.x - that.getX, this.y - that.getY)

  def add(scalar: Float) = new Vec2(this.x + scalar, this.y + scalar)
  def subtract(scalar: Float) = new Vec2(this.x - scalar, this.y - scalar)
  def multiply(scalar: Float) = new Vec2(this.x * scalar, this.y * scalar)
  def divide(scalar: Float) = new Vec2(this.x / scalar, this.y / scalar)

  def dot(that: Vector2) = this.x * that.getX + this.y * that.getY

  def length = Math.sqrt(lengthSquared).toFloat
  def lengthSquared = x * x + y * y

  def asNormal = new Vec2(this.x / length, this.y / length)
  def negative = new Vec2(-this.x, -this.y)
  def absolute = new Vec2(Math.abs(this.x), Math.abs(this.y))

  //Add Scala operators that behave the same as the above:
  def +(that: Vector2) = new Vec2(this.x + that.getX, this.y + that.getY)
  def -(that: Vector2) = new Vec2(this.x - that.getX, this.y - that.getY)

  def +(scalar: Float) = new Vec2(this.x + scalar, this.y + scalar)
  def -(scalar: Float) = new Vec2(this.x - scalar, this.y - scalar)
  def *(scalar: Float) = new Vec2(this.x * scalar, this.y * scalar)
  def /(scalar: Float) = new Vec2(this.x / scalar, this.y / scalar)

  def unary_- = new Vec2(-this.x, -this.y)
}
