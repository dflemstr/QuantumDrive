package org.quantumdrive.math.immutable

import org.quantumdrive.math.MatrixArithmetic3
import org.quantumdrive.math.mutable.MMat3Impl

private[math] final case class Mat3Impl(
  final val c00: Float, final val c10: Float, final val c20: Float,
  final val c01: Float, final val c11: Float, final val c21: Float,
  final val c02: Float, final val c12: Float, final val c22: Float)
    extends ImmutableMatrix3 with MatrixArithmetic3 {

  final def mutable = new MMat3Impl(c00, c10, c20, c01, c11, c21, c02, c12, c22)
}
