package org.quantumdrive.math

import org.quantumdrive.math.immutable.ImmutableMatrix2
import org.quantumdrive.math.immutable.Mat2Impl

object Mat2 {
  final def apply(c00: Float, c10: Float, c01: Float, c11: Float): ImmutableMatrix2 =
    new Mat2Impl(c00, c10, c01, c11)
  final def unapply(value: Matrix2) =
    Some((value.c00, value.c10, value.c01, value.c11))
}
