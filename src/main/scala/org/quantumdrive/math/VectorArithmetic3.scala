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
  def dimension = 3
  
  def getX = x
  def getY = y
  def getZ = z

  def add(that: Vector3) = new Vec3Impl(this.x + that.getX, this.y + that.getY, this.z + that.getZ)
  def subtract(that: Vector3) = new Vec3Impl(this.x - that.getX, this.y - that.getY, this.z - that.getZ)

  def add(scalar: Float) = new Vec3Impl(this.x + scalar, this.y + scalar, this.z + scalar)
  def subtract(scalar: Float) = new Vec3Impl(this.x - scalar, this.y - scalar, this.z - scalar)
  def multiply(scalar: Float) = new Vec3Impl(this.x * scalar, this.y * scalar, this.z * scalar)
  def divide(scalar: Float) = new Vec3Impl(this.x / scalar, this.y / scalar, this.z / scalar)

  def dot(that: Vector3) = this.x * that.getX + this.y * that.getY + this.z * that.getZ

  def length = Math.sqrt(lengthSquared).toFloat
  def lengthSquared = x * x + y * y + z * z

  def asNormal = new Vec3Impl(this.x / length, this.y / length, this.z / length)
  def negative = new Vec3Impl(-this.x, -this.y, -this.z)
  def absolute = new Vec3Impl(Math.abs(this.x), Math.abs(this.y), Math.abs(this.z))

  //Add Scala operators that behave the same as the above:
  def +(that: Vector3) = new Vec3Impl(this.x + that.getX, this.y + that.getY, this.z + that.getZ)
  def -(that: Vector3) = new Vec3Impl(this.x - that.getX, this.y - that.getY, this.z - that.getZ)

  def +(scalar: Float) = new Vec3Impl(this.x + scalar, this.y + scalar, this.z + scalar)
  def -(scalar: Float) = new Vec3Impl(this.x - scalar, this.y - scalar, this.z - scalar)
  def *(scalar: Float) = new Vec3Impl(this.x * scalar, this.y * scalar, this.z * scalar)
  def /(scalar: Float) = new Vec3Impl(this.x / scalar, this.y / scalar, this.z / scalar)

  def unary_- = new Vec3Impl(-this.x, -this.y, -this.z)
  def abs = new Vec3Impl(Math.abs(this.x), Math.abs(this.y), Math.abs(this.z))
}
