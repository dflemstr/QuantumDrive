package org.quantumdrive.math.mutable

import org.quantumdrive.math.Vector3
import org.quantumdrive.math.VectorArithmetic3
import org.quantumdrive.math.immutable.Vec3Impl

/**
 * A MutableVector2 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
private[math] case class MVec3Impl(var x: Float, var y: Float, var z: Float) extends MutableVector3 with VectorArithmetic3 {

  //Implement the methods from the interface:
  def view = new Vec3Impl(x, y, z)

  def setX(value: Float) = (x = value)

  def setY(value: Float) = (y = value)
  
  def setZ(value: Float) = (z = value)

  def addLocal(that: Vector3) = {
    x += that.getX
    y += that.getY
    z += that.getZ
  }

  def subtractLocal(that: Vector3) = {
    x -= that.getX
    y -= that.getY
    z -= that.getZ
  }

  def addLocal(scalar: Float) = {
    x += scalar
    y += scalar
    z += scalar
  }

  def subtractLocal(scalar: Float) = {
    x -= scalar
    y -= scalar
    z -= scalar
  }

  def multiplyLocal(scalar: Float) = {
    x *= scalar
    y *= scalar
    z *= scalar
  }

  def divideLocal(scalar: Float) = {
    x /= scalar
    y /= scalar
    z /= scalar
  }

  def normalize = {
    x /= length
    y /= length
    z /= length
  }
  
  def negate = {
    x = -x
    y = -y
    z = -z
  }

  def makeAbsolute = {
    x = Math.abs(x)
    y = Math.abs(y)
    z = Math.abs(z)
  }

  def +=(that: Vector3) = addLocal(that)
  def -=(that: Vector3) = subtractLocal(that)
  
  def +=(scalar: Float) = addLocal(scalar)
  def -=(scalar: Float) = subtractLocal(scalar)
  def *=(scalar: Float) = multiplyLocal(scalar)
  def /=(scalar: Float) = divideLocal(scalar)
}
