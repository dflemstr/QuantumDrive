package org.quantumdrive.math.immutable

import org.quantumdrive.math.MatrixArithmetic3
import org.quantumdrive.math.mutable.MMat3Impl

private[math] final case class Mat3Impl(data: Array[Float])
    extends ImmutableMatrix3 with MatrixArithmetic3 {
  def this(c11: Float, c21: Float, c31: Float,
           c12: Float, c22: Float, c32: Float,
           c13: Float, c23: Float, c33: Float) =
    this(Array(c11, c21, c31, c12, c22, c32, c13, c23, c33))

  final def mutable = new MMat3Impl(c11, c21, c31, c12, c22, c32, c13, c23, c33)
}
