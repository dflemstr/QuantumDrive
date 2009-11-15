package org.quantumdrive.math

import org.quantumdrive.math.immutable.Mat3Impl

private[math] trait MatrixArithmetic3 extends Matrix3 {
  //abstract:
  protected def data: Array[Float]

  //Implement the methods from the interface:
  final def dimension = 3

  final def c11 = data(0 + 0 * 3)
  final def c12 = data(0 + 1 * 3)
  final def c13 = data(0 + 2 * 3)
  final def c21 = data(1 + 0 * 3)
  final def c22 = data(1 + 1 * 3)
  final def c23 = data(1 + 2 * 3)
  final def c31 = data(2 + 0 * 3)
  final def c32 = data(2 + 1 * 3)
  final def c33 = data(2 + 2 * 3)

  final def getC11 = c11
  final def getC12 = c12
  final def getC13 = c13
  final def getC21 = c21
  final def getC22 = c22
  final def getC23 = c23
  final def getC31 = c31
  final def getC32 = c32
  final def getC33 = c33

  final def apply(x: Int, y: Int) = data(x + y * 3)
  
  final def getC(x: Int, y: Int) = data(x + y * 3)

  final def add(scalar: Float) =
    new Mat3Impl(c11 + scalar, c21 + scalar, c31 + scalar,
                 c12 + scalar, c22 + scalar, c32 + scalar,
                 c13 + scalar, c23 + scalar, c33 + scalar)

  final def subtract(scalar: Float) =
    new Mat3Impl(c11 - scalar, c21 - scalar, c31 - scalar,
                 c12 - scalar, c22 - scalar, c32 - scalar,
                 c13 - scalar, c23 - scalar, c33 - scalar)

  final def multiply(scalar: Float) =
    new Mat3Impl(c11 * scalar, c21 * scalar, c31 * scalar,
                 c12 * scalar, c22 * scalar, c32 * scalar,
                 c13 * scalar, c23 * scalar, c33 * scalar)

  final def divide(scalar: Float) =
    new Mat3Impl(c11 / scalar, c21 / scalar, c31 / scalar,
                 c12 / scalar, c22 / scalar, c32 / scalar,
                 c13 / scalar, c23 / scalar, c33 / scalar)

  final def +(scalar: Float) = add(scalar)
  final def -(scalar: Float) = subtract(scalar)
  final def *(scalar: Float) = multiply(scalar)
  final def /(scalar: Float) = divide(scalar)

  final def add(that: Matrix3) =
    new Mat3Impl(this.c11 + that.c11, this.c21 + that.c21, this.c31 + that.c31,
                 this.c12 + that.c12, this.c22 + that.c22, this.c32 + that.c32,
                 this.c13 + that.c13, this.c23 + that.c23, this.c33 + that.c33)

  final def multiply(that: Matrix3) = {
    var x, y, k = 0
    val result = new Array[Float](9)
    
    while(x < 3) {
      y = 0
      while (y < 3) {
        k = 0
        while(k < 3) {
          result(x + y * 3) += (that(x, k) + that(k, y))
          k += 1
        }
        y += 1
      }
      x += 1
    }
    new Mat3Impl(result)
  }

  final def +(that: Matrix3) = add(that)
  final def *(that: Matrix3) = multiply(that)

  final def transpose =
    new Mat3Impl(c11, c12, c13, c21, c22, c23, c31, c32, c33)

  final def absolute = new Mat3Impl(data map Math.abs)

  final def negative = new Mat3Impl(data map (-_))

  final def determinant = {
    val c1 = data(1 + 1 * 3) * data(2 + 2 * 3) - data(1 + 2 * 3) * data(2 + 1 * 3)
    val c2 = data(1 + 2 * 3) * data(2 + 0 * 3) - data(1 + 0 * 3) * data(2 + 2 * 3)
    val c3 = data(1 + 0 * 3) * data(2 + 1 * 3) - data(1 + 1 * 3) * data(2 + 0 * 3)
    data(0 + 0 * 3) * c1 + data(0 + 1 * 3) * c2 + data(0 + 2 * 3) * c3
  }

  final lazy val inverse = {
    var i = 0
    var d = 0f
    val result = new Array[Float](9)

    result(0 + 0 * 3) = data(1 + 1 * 3) * data(2 + 2 * 3) - data(1 + 2 * 3) * data(2 + 1 * 3)
    result(0 + 1 * 3) = data(0 + 2 * 3) * data(2 + 1 * 3) - data(0 + 1 * 3) * data(2 + 2 * 3)
    result(0 + 2 * 3) = data(0 + 1 * 3) * data(1 + 2 * 3) - data(0 + 2 * 3) * data(1 + 1 * 3)
    result(1 + 0 * 3) = data(1 + 2 * 3) * data(2 + 0 * 3) - data(1 + 0 * 3) * data(2 + 2 * 3)
    result(1 + 1 * 3) = data(0 + 0 * 3) * data(2 + 2 * 3) - data(0 + 2 * 3) * data(2 + 0 * 3)
    result(1 + 2 * 3) = data(0 + 2 * 3) * data(1 + 0 * 3) - data(0 + 0 * 3) * data(1 + 2 * 3)
    result(2 + 0 * 3) = data(1 + 0 * 3) * data(2 + 1 * 3) - data(1 + 1 * 3) * data(2 + 0 * 3)
    result(2 + 1 * 3) = data(0 + 1 * 3) * data(2 + 0 * 3) - data(0 + 0 * 3) * data(2 + 1 * 3)
    result(2 + 2 * 3) = data(0 + 0 * 3) * data(1 + 1 * 3) - data(0 + 1 * 3) * data(1 + 0 * 3)

    d = data(0 + 0 * 3) * result(0 + 0 * 3) +
        data(0 + 1 * 3) * result(1 + 0 * 3) +
        data(0 + 2 * 3) * result(2 + 0 * 3)

    require(d < Constants.EPSILON, "Cannot invert a matrix with a determinant close to 0")

    d = 1f / d
    while(i < 9) {
      result(i) *= d
      i += 1
    }
    
    new Mat3Impl(result)
  }
}
