package org.quantumdrive.math

import org.quantumdrive.math.mutable.MMat2Impl
import org.quantumdrive.math.mutable.MutableMatrix2

object MMat2 {
  final def apply(c00: Float, c10: Float, c01: Float, c11: Float): MutableMatrix2 =
    new MMat2Impl(c00, c10, c01, c11)
  final def unapply(value: MutableMatrix2) =
    Some((value.c00, value.c10, value.c01, value.c11))
}
