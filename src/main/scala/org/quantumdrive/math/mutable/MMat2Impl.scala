package org.quantumdrive.math.mutable

import org.quantumdrive.math.MatrixArithmetic2
import org.quantumdrive.math.immutable.Mat2Impl

private[math] final case class MMat2Impl(final val data: Array[Float])
    extends MutableMatrix2 with MatrixArithmetic2 {

  def this(c11: Float, c21: Float,
           c12: Float, c22: Float) =
    this(Array(c11, c21, c12, c22))

  final def view = new Mat2Impl(c11, c21, c12, c22)
}
