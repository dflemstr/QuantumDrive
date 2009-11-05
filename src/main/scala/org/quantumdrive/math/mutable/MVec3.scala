package org.quantumdrive.math.mutable

import org.quantumdrive.math.Vector3
import org.quantumdrive.math.VectorArithmetic3
import org.quantumdrive.math.immutable.Vec3

case class MVec3(var x: Float, var y: Float, var z: Float) extends MutableVector3 with VectorArithmetic3 {

  def view = new Vec3(x, y, z)

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
