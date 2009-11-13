package org.quantumdrive.math

import org.quantumdrive.math.immutable.Vec2Impl

/**
 * Implements arithmetic that's used in both mutable vectors and immutable vectors.
 */
private[math] trait VectorArithmetic2 extends Vector2 {
  //Abstract:
  def x: Float
  def y: Float

  //Implement the methods from the interface:
  def dimension = 2

  def getX = x
  def getY = y

  def add(that: Vector2) = new Vec2Impl(this.x + that.getX, this.y + that.getY)
  def subtract(that: Vector2) = new Vec2Impl(this.x - that.getX, this.y - that.getY)

  def add(scalar: Float) = new Vec2Impl(this.x + scalar, this.y + scalar)
  def subtract(scalar: Float) = new Vec2Impl(this.x - scalar, this.y - scalar)
  def multiply(scalar: Float) = new Vec2Impl(this.x * scalar, this.y * scalar)
  def divide(scalar: Float) = new Vec2Impl(this.x / scalar, this.y / scalar)

  def dot(that: Vector2) = this.x * that.getX + this.y * that.getY

  def length = Math.sqrt(lengthSquared).toFloat
  def lengthSquared = x * x + y * y

  def asNormal = new Vec2Impl(this.x / length, this.y / length)
  def negative = new Vec2Impl(-this.x, -this.y)
  def absolute = new Vec2Impl(Math.abs(this.x), Math.abs(this.y))

  //Add Scala operators that behave the same as the above:
  def +(that: Vector2) = new Vec2Impl(this.x + that.getX, this.y + that.getY)
  def -(that: Vector2) = new Vec2Impl(this.x - that.getX, this.y - that.getY)

  def +(scalar: Float) = new Vec2Impl(this.x + scalar, this.y + scalar)
  def -(scalar: Float) = new Vec2Impl(this.x - scalar, this.y - scalar)
  def *(scalar: Float) = new Vec2Impl(this.x * scalar, this.y * scalar)
  def /(scalar: Float) = new Vec2Impl(this.x / scalar, this.y / scalar)

  def unary_- = new Vec2Impl(-this.x, -this.y)
  def abs = new Vec2Impl(Math.abs(this.x), Math.abs(this.y))
}
