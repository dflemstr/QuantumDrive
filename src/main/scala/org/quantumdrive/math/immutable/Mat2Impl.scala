package org.quantumdrive.math.immutable

import org.quantumdrive.math.MatrixArithmetic2
import org.quantumdrive.math.mutable.MMat2Impl

private[math] final case class Mat2Impl(
  final val c00: Float, final val c10: Float,
  final val c01: Float, final val c11: Float)
    extends ImmutableMatrix2 with MatrixArithmetic2 {
  final def mutable = new MMat2Impl(c00, c10, c01, c11)
}
