package org.quantumdrive.math.immutable

import org.quantumdrive.math.MatrixArithmetic2
import org.quantumdrive.math.mutable.MMat2Impl

private[math] final case class Mat2Impl(final val c11: Float, final val c21: Float,
                                        final val c12: Float, final val c22: Float)
    extends ImmutableMatrix2 with MatrixArithmetic2 {
  final def mutable = new MMat2Impl(c11, c21, c12, c22)
}
