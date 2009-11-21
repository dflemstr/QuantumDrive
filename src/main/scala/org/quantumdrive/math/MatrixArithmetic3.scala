package org.quantumdrive.math

import org.quantumdrive.math.immutable.Mat3Impl
import org.quantumdrive.math.immutable.Vec3Impl

private[math] trait MatrixArithmetic3 extends Matrix3 {
  //abstract:
  def c00: Float
  def c01: Float
  def c02: Float
  def c10: Float
  def c11: Float
  def c12: Float
  def c20: Float
  def c21: Float
  def c22: Float

  //Implement the methods from the interface:
  final def dimension = 3

  final def getC00 = c00
  final def getC01 = c01
  final def getC02 = c02
  final def getC10 = c10
  final def getC11 = c11
  final def getC12 = c12
  final def getC20 = c20
  final def getC21 = c21
  final def getC22 = c22

  final def apply(x: Int, y: Int) = {
    val xycomb = x | y
    if((xycomb & 3) != xycomb)
      throw new ArrayIndexOutOfBoundsException
    else (x << 2) | y match {
      case 0 => c00
      case 1 => c01
      case 2 => c02
      case 4 => c10
      case 5 => c11
      case 6 => c12
      case 8 => c20
      case 9 => c21
      case 10 => c22
      case _ => throw new ArrayIndexOutOfBoundsException
    }
  }
 
  final def getC(x: Int, y: Int) = apply(x, y)

  final def add(scalar: Float) =
    new Mat3Impl(
      c00 + scalar, c10 + scalar, c20 + scalar,
      c01 + scalar, c11 + scalar, c21 + scalar,
      c02 + scalar, c12 + scalar, c22 + scalar
    )

  final def subtract(scalar: Float) =
    new Mat3Impl(
      c00 - scalar, c10 - scalar, c20 - scalar,
      c01 - scalar, c11 - scalar, c21 - scalar,
      c02 - scalar, c12 - scalar, c22 - scalar
    )

  final def multiply(scalar: Float) =
    new Mat3Impl(
      c00 * scalar, c10 * scalar, c20 * scalar,
      c01 * scalar, c11 * scalar, c21 * scalar,
      c02 * scalar, c12 * scalar, c22 * scalar
    )

  final def divide(scalar: Float) =
    new Mat3Impl(
      c00 / scalar, c10 / scalar, c20 / scalar,
      c01 / scalar, c11 / scalar, c21 / scalar,
      c02 / scalar, c12 / scalar, c22 / scalar
    )

  final def +(scalar: Float) = add(scalar)
  final def -(scalar: Float) = subtract(scalar)
  final def *(scalar: Float) = multiply(scalar)
  final def /(scalar: Float) = divide(scalar)

  final def add(that: Matrix3) =
    new Mat3Impl(
      c00 + that.c00, c10 + that.c10, c20 + that.c20,
      c01 + that.c01, c11 + that.c11, c21 + that.c21,
      c02 + that.c02, c12 + that.c12, c22 + that.c22
    )

  final def multiply(that: Matrix3) =
    new Mat3Impl(
      c00 * that.c00 + c01 * that.c10 + c02 * that.c20,
      c00 * that.c01 + c01 * that.c11 + c02 * that.c21,
      c00 * that.c02 + c01 * that.c12 + c02 * that.c22,
      c10 * that.c00 + c11 * that.c10 + c12 * that.c20,
      c10 * that.c01 + c11 * that.c11 + c12 * that.c21,
      c10 * that.c02 + c11 * that.c12 + c12 * that.c22,
      c20 * that.c00 + c21 * that.c10 + c22 * that.c20,
      c20 * that.c01 + c21 * that.c11 + c22 * that.c21,
      c20 * that.c02 + c21 * that.c12 + c22 * that.c22
    )

  final def multiplyTranspose(that: Matrix3) =
    new Mat3Impl(
      c00 * that.c00 + c10 * that.c10 + c20 * that.c20,
      c00 * that.c01 + c10 * that.c11 + c20 * that.c21,
      c00 * that.c02 + c10 * that.c12 + c20 * that.c22,
      c01 * that.c00 + c11 * that.c10 + c21 * that.c20,
      c01 * that.c01 + c11 * that.c11 + c21 * that.c21,
      c01 * that.c02 + c11 * that.c12 + c21 * that.c22,
      c02 * that.c00 + c12 * that.c10 + c22 * that.c20,
      c02 * that.c01 + c12 * that.c11 + c22 * that.c21,
      c02 * that.c02 + c12 * that.c12 + c22 * that.c22
    )

  final def +(that: Matrix3) = add(that)
  final def *(that: Matrix3) = multiply(that)

  final def transpose =
    new Mat3Impl(c00, c01, c02, c10, c11, c12, c20, c21, c22)

  final def absolute = new Mat3Impl(
    Math.abs(c00), Math.abs(c10), Math.abs(c20),
    Math.abs(c01), Math.abs(c11), Math.abs(c21),
    Math.abs(c02), Math.abs(c12), Math.abs(c22))

  final def negative = new Mat3Impl(
      -c00, -c10, -c20,
      -c01, -c11, -c21,
      -c02, -c12, -c22)

  final def determinant =
    c00 * (c11 * c22 - c21 * c12) - c01 * (c10 * c22 - c20 * c12) + c02 * (c10 * c21 - c20 * c11)

  final def inverse = {
    var d = determinant
    require(d < Constants.EPSILON, "Cannot invert a matrix with a determinant close to 0")

    d = 1f / d
    new Mat3Impl(
      (c11 * c22 - c12 * c21) * d, (c02 * c21 - c01 * c22) * d, (c01 * c12 - c02 * c11) * d,
      (c12 * c20 - c10 * c22) * d, (c00 * c22 - c02 * c20) * d, (c02 * c10 - c00 * c12) * d,
      (c10 * c21 - c11 * c20) * d, (c01 * c20 - c00 * c21) * d, (c00 * c11 - c01 * c10) * d
    )
  }

  final def transform(vector: Vector3) =
    new Vec3Impl(c00 * vector.x + c01 * vector.y + c02 * vector.z,
                 c10 * vector.x + c11 * vector.y + c12 * vector.z,
                 c20 * vector.x + c21 * vector.y + c22 * vector.z)
 
  final def transformTranspose(vector: Vector3) =
    new Vec3Impl(c00 * vector.x + c10 * vector.y + c20 * vector.z,
                 c01 * vector.x + c11 * vector.y + c21 * vector.z,
                 c02 * vector.x + c12 * vector.y + c22 * vector.z)
}
