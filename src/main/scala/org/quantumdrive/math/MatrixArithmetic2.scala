package org.quantumdrive.math

import org.quantumdrive.math.immutable.Mat2Impl
import org.quantumdrive.math.immutable.Vec2Impl

private[math] trait MatrixArithmetic2 extends Matrix2 {
  //abstract:
  def c00: Float
  def c01: Float
  def c10: Float
  def c11: Float

  //Implement the methods from the interface:
  final def dimension = 2

  final def getC00 = c00
  final def getC01 = c01
  final def getC10 = c10
  final def getC11 = c11

  final def apply(x: Int, y: Int) = {
    val idx = (x << 1) | y
    if((idx & 3) != idx)
      throw new ArrayIndexOutOfBoundsException
    else
      idx match {
        case 0 => c00
        case 1 => c01
        case 2 => c10
        case 3 => c11
      }
  }

  final def getC(x: Int, y: Int) = apply(x, y)

  final def add(scalar: Float) =
    new Mat2Impl(
        c00 + scalar, c10 + scalar,
        c01 + scalar, c11 + scalar
    )

  final def subtract(scalar: Float) =
    new Mat2Impl(
        c00 - scalar, c10 - scalar,
        c01 - scalar, c11 - scalar
    )

  final def multiply(scalar: Float) =
    new Mat2Impl(
        c00 * scalar, c10 * scalar,
        c01 * scalar, c11 * scalar
    )

  final def divide(scalar: Float) =
    new Mat2Impl(
        c00 / scalar, c10 / scalar,
        c01 / scalar, c11 / scalar
    )

  final def +(scalar: Float) = add(scalar)
  final def -(scalar: Float) = subtract(scalar)
  final def *(scalar: Float) = multiply(scalar)
  final def /(scalar: Float) = divide(scalar)

  final def add(that: Matrix2) =
    new Mat2Impl(
        c00 + that.c00, c10 + that.c10,
        c01 + that.c01, c11 + that.c11
    )

  final def multiply(that: Matrix2) =
    new Mat2Impl(
        c00 * that.c00 + c01 * that.c10,
        c00 * that.c01 + c01 * that.c11,
        c10 * that.c00 + c11 * that.c10,
        c10 * that.c01 + c11 * that.c11
    )

  final def +(that: Matrix2) = add(that)
  final def *(that: Matrix2) = multiply(that)

  final def multiplyTranspose(that: Matrix2) =
    new Mat2Impl(
        c00 * that.c00 + c10 * that.c10,
        c00 * that.c01 + c10 * that.c11,
        c01 * that.c00 + c11 * that.c10,
        c01 * that.c01 + c11 * that.c11
    )

  final def transpose = new Mat2Impl(c00, c10,
                                     c01, c11)

  final def absolute = new Mat2Impl(Math.abs(c00), Math.abs(c10),
                                    Math.abs(c01), Math.abs(c11))

  final def negative = new Mat2Impl(-c00, -c10,
                                    -c01, -c11)

  final def determinant = c00 * c11 - c01 * c10

  final def inverse = {
    var d = determinant
    require(d < Constants.EPSILON, "Cannot invert a matrix with a determinant close to 0")

    d = 1f / d

    new Mat2Impl(
        d * c11, -d * c01,
        -d * c10, d * c00
    )
  }

  final def transform(vector: Vector2) =
    new Vec2Impl(c00 * vector.x + c01 * vector.y,
                 c10 * vector.x + c11 * vector.y)

  final def transformTranspose(vector: Vector2) =
    new Vec2Impl(c00 * vector.x + c10 * vector.y,
                 c01 * vector.x + c11 * vector.y)
}
