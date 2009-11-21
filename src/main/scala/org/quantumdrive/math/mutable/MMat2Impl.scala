package org.quantumdrive.math.mutable

import org.quantumdrive.math.Matrix2
import org.quantumdrive.math.MatrixArithmetic2
import org.quantumdrive.math.immutable.Mat2Impl

private[math] final case class MMat2Impl(
  final var c00: Float, final var c10: Float,
  final var c01: Float, final var c11: Float)
    extends MutableMatrix2 with MatrixArithmetic2 {

  final def view = new Mat2Impl(c00, c10, c01, c11)

  final def update(x: Int, y: Int, value: Float) = {
    val idx = (x << 1) | y
    if((idx & 3) != idx)
      throw new ArrayIndexOutOfBoundsException
    else
      idx match {
        case 0 => c00 = value
        case 1 => c01 = value
        case 2 => c10 = value
        case 3 => c11 = value
      }
  }

  final def setC(x: Int, y: Int, value: Float) = update(x, y, value)

  final def setC00(value: Float) = (c00 = value)

  final def setC01(value: Float) = (c01 = value)

  final def setC10(value: Float) = (c10 = value)

  final def setC11(value: Float) = (c11 = value)


  final def addLocal(scalar: Float) = {
    c00 += scalar
    c01 += scalar
    c10 += scalar
    c11 += scalar
  }

  final def +=(scalar: Float) = addLocal(scalar)

  final def subtractLocal(scalar: Float) = {
    c00 -= scalar
    c01 -= scalar
    c10 -= scalar
    c11 -= scalar
  }

  final def -=(scalar: Float) = subtractLocal(scalar)

  final def multiplyLocal(scalar: Float) = {
    c00 *= scalar
    c01 *= scalar
    c10 *= scalar
    c11 *= scalar
  }

  final def *=(scalar: Float) = multiplyLocal(scalar)

  final def divideLocal(scalar: Float) = {
    c00 /= scalar
    c01 /= scalar
    c10 /= scalar
    c11 /= scalar
  }

  final def /=(scalar: Float) = divideLocal(scalar)

  final def addLocal(matrix: Matrix2) = {
    c00 += matrix.c00
    c10 += matrix.c10
    c01 += matrix.c01
    c11 += matrix.c11
  }

  final def +=(matrix: Matrix2) = addLocal(matrix)

  final def multiplyLocal(that: Matrix2) = {
    c00 = c00 * that.c00 + c01 * that.c10
    c10 = c00 * that.c01 + c01 * that.c11
    c01 = c10 * that.c00 + c11 * that.c10
    c11 = c10 * that.c01 + c11 * that.c11
  }

  final def *=(matrix: Matrix2) = multiplyLocal(matrix)

  final def multiplyTransposeLocal(that: Matrix2) = {
    c00 = c00 * that.c00 + c10 * that.c10
    c10 = c00 * that.c01 + c10 * that.c11
    c01 = c01 * that.c00 + c11 * that.c10
    c11 = c01 * that.c01 + c11 * that.c11
  }
}
