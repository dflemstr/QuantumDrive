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
  final def dimension = 2

  final def getX = x
  final def getY = y

  final def add(that: Vector2) = new Vec2Impl(this.x + that.getX, this.y + that.getY)
  final def subtract(that: Vector2) = new Vec2Impl(this.x - that.getX, this.y - that.getY)

  final def add(scalar: Float) = new Vec2Impl(this.x + scalar, this.y + scalar)
  final def subtract(scalar: Float) = new Vec2Impl(this.x - scalar, this.y - scalar)
  final def multiply(scalar: Float) = new Vec2Impl(this.x * scalar, this.y * scalar)
  final def divide(scalar: Float) = new Vec2Impl(this.x / scalar, this.y / scalar)

  final def dot(that: Vector2) = this.x * that.getX + this.y * that.getY

  final def length = Math.sqrt(lengthSquared).toFloat
  final def lengthSquared = x * x + y * y

  final def asNormal = new Vec2Impl(this.x / length, this.y / length)
  final def negative = new Vec2Impl(-this.x, -this.y)
  final def absolute = new Vec2Impl(Math.abs(this.x), Math.abs(this.y))

  //Add Scala operators that behave the same as the above:
  final def +(that: Vector2) = new Vec2Impl(this.x + that.getX, this.y + that.getY)
  final def -(that: Vector2) = new Vec2Impl(this.x - that.getX, this.y - that.getY)

  final def +(scalar: Float) = new Vec2Impl(this.x + scalar, this.y + scalar)
  final def -(scalar: Float) = new Vec2Impl(this.x - scalar, this.y - scalar)
  final def *(scalar: Float) = new Vec2Impl(this.x * scalar, this.y * scalar)
  final def /(scalar: Float) = new Vec2Impl(this.x / scalar, this.y / scalar)

  final def unary_- = new Vec2Impl(-this.x, -this.y)
  final def abs = new Vec2Impl(Math.abs(this.x), Math.abs(this.y))
}
