package org.quantumdrive.math

import org.quantumdrive.math.immutable.Vec3Impl

/**
 * Implements arithmetic that's used in both mutable vectors and immutable vectors.
 */
private[math] trait VectorArithmetic3 extends Vector3 {
  //Abstract:
  def x: Float
  def y: Float
  def z: Float

  //Implement the methods from the interface:
  final def dimension = 3
 
  final def getX = x
  final def getY = y
  final def getZ = z

  final def add(that: Vector3) = new Vec3Impl(this.x + that.getX, this.y + that.getY, this.z + that.getZ)
  final def subtract(that: Vector3) = new Vec3Impl(this.x - that.getX, this.y - that.getY, this.z - that.getZ)

  final def add(scalar: Float) = new Vec3Impl(this.x + scalar, this.y + scalar, this.z + scalar)
  final def subtract(scalar: Float) = new Vec3Impl(this.x - scalar, this.y - scalar, this.z - scalar)
  final def multiply(scalar: Float) = new Vec3Impl(this.x * scalar, this.y * scalar, this.z * scalar)
  final def divide(scalar: Float) = new Vec3Impl(this.x / scalar, this.y / scalar, this.z / scalar)

  final def dot(that: Vector3) = this.x * that.getX + this.y * that.getY + this.z * that.getZ

  final def length = Math.sqrt(lengthSquared).toFloat
  final def lengthSquared = x * x + y * y + z * z

  final def asNormal = new Vec3Impl(this.x / length, this.y / length, this.z / length)
  final def negative = new Vec3Impl(-this.x, -this.y, -this.z)
  final def absolute = new Vec3Impl(Math.abs(this.x), Math.abs(this.y), Math.abs(this.z))

  //Add Scala operators that behave the same as the above:
  final def +(that: Vector3) = new Vec3Impl(this.x + that.getX, this.y + that.getY, this.z + that.getZ)
  final def -(that: Vector3) = new Vec3Impl(this.x - that.getX, this.y - that.getY, this.z - that.getZ)

  final def +(scalar: Float) = new Vec3Impl(this.x + scalar, this.y + scalar, this.z + scalar)
  final def -(scalar: Float) = new Vec3Impl(this.x - scalar, this.y - scalar, this.z - scalar)
  final def *(scalar: Float) = new Vec3Impl(this.x * scalar, this.y * scalar, this.z * scalar)
  final def /(scalar: Float) = new Vec3Impl(this.x / scalar, this.y / scalar, this.z / scalar)

  final def unary_- = new Vec3Impl(-this.x, -this.y, -this.z)
  final def abs = new Vec3Impl(Math.abs(this.x), Math.abs(this.y), Math.abs(this.z))
}
