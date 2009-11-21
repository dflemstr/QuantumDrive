package org.quantumdrive.math.mutable

import org.quantumdrive.math.Matrix3
import org.quantumdrive.math.MatrixArithmetic3
import org.quantumdrive.math.immutable.Mat3Impl

private[math] final case class MMat3Impl(
  final var c00: Float, final var c10: Float, final var c20: Float,
  final var c01: Float, final var c11: Float, final var c21: Float,
  final var c02: Float, final var c12: Float, final var c22: Float)
    extends MutableMatrix3 with MatrixArithmetic3 {

  final def view = new Mat3Impl(c00, c10, c20, c01, c11, c21, c02, c12, c22)

  final def update(x: Int, y: Int, value: Float) = {
    val xycomb = x | y
    if((xycomb & 3) != xycomb)
      throw new ArrayIndexOutOfBoundsException
    else (x << 2) | y match {
      case 0 => c00 = value
      case 1 => c01 = value
      case 2 => c02 = value
      case 4 => c10 = value
      case 5 => c11 = value
      case 6 => c12 = value
      case 8 => c20 = value
      case 9 => c21 = value
      case 10 => c22 = value
      case _ => throw new ArrayIndexOutOfBoundsException
    }
  }
 
  final def setC(x: Int, y: Int, value: Float) = update(x, y, value)

  final def setC00(value: Float) = (c00 = value)

  final def setC01(value: Float) = (c01 = value)

  final def setC02(value: Float) = (c02 = value)

  final def setC10(value: Float) = (c10 = value)

  final def setC11(value: Float) = (c11 = value)

  final def setC12(value: Float) = (c12 = value)

  final def setC20(value: Float) = (c20 = value)

  final def setC21(value: Float) = (c21 = value)

  final def setC22(value: Float) = (c22 = value)

  final def addLocal(scalar: Float) = {
    c00 += scalar
    c01 += scalar
    c02 += scalar
    c10 += scalar
    c11 += scalar
    c12 += scalar
    c20 += scalar
    c21 += scalar
    c22 += scalar
  }

  final def +=(scalar: Float) = addLocal(scalar)

  final def subtractLocal(scalar: Float) = {
    c00 -= scalar
    c01 -= scalar
    c02 -= scalar
    c10 -= scalar
    c11 -= scalar
    c12 -= scalar
    c20 -= scalar
    c21 -= scalar
    c22 -= scalar
  }

  final def -=(scalar: Float) = subtractLocal(scalar)

  final def multiplyLocal(scalar: Float) = {
    c00 *= scalar
    c01 *= scalar
    c02 *= scalar
    c10 *= scalar
    c11 *= scalar
    c12 *= scalar
    c20 *= scalar
    c21 *= scalar
    c22 *= scalar
  }

  final def *=(scalar: Float) = multiplyLocal(scalar)

  final def divideLocal(scalar: Float) = {
    c00 /= scalar
    c01 /= scalar
    c02 /= scalar
    c10 /= scalar
    c11 /= scalar
    c12 /= scalar
    c20 /= scalar
    c21 /= scalar
    c22 /= scalar
  }

  final def /=(scalar: Float) = divideLocal(scalar)

  final def addLocal(matrix: Matrix3) = {
    c00 += matrix.c00
    c10 += matrix.c10
    c20 += matrix.c20
    c01 += matrix.c01
    c11 += matrix.c11
    c21 += matrix.c21
    c02 += matrix.c02
    c12 += matrix.c12
    c22 += matrix.c22
  }

  final def +=(matrix: Matrix3) = addLocal(matrix)

  final def multiplyLocal(that: Matrix3) = {
    c00 = c00 * that.c00 + c01 * that.c10 + c02 * that.c20
    c10 = c00 * that.c01 + c01 * that.c11 + c02 * that.c21
    c20 = c00 * that.c02 + c01 * that.c12 + c02 * that.c22
    c01 = c10 * that.c00 + c11 * that.c10 + c12 * that.c20
    c11 = c10 * that.c01 + c11 * that.c11 + c12 * that.c21
    c21 = c10 * that.c02 + c11 * that.c12 + c12 * that.c22
    c02 = c20 * that.c00 + c21 * that.c10 + c22 * that.c20
    c12 = c20 * that.c01 + c21 * that.c11 + c22 * that.c21
    c22 = c20 * that.c02 + c21 * that.c12 + c22 * that.c22
  }

  final def *=(matrix: Matrix3) = multiplyLocal(matrix)

  final def multiplyTransposeLocal(that: Matrix3) = {
    c00 = c00 * that.c00 + c10 * that.c10 + c20 * that.c20
    c10 = c00 * that.c01 + c10 * that.c11 + c20 * that.c21
    c20 = c00 * that.c02 + c10 * that.c12 + c20 * that.c22
    c01 = c01 * that.c00 + c11 * that.c10 + c21 * that.c20
    c11 = c01 * that.c01 + c11 * that.c11 + c21 * that.c21
    c21 = c01 * that.c02 + c11 * that.c12 + c21 * that.c22
    c02 = c02 * that.c00 + c12 * that.c10 + c22 * that.c20
    c12 = c02 * that.c01 + c12 * that.c11 + c22 * that.c21
    c22 = c02 * that.c02 + c12 * that.c12 + c22 * that.c22
  }
}
