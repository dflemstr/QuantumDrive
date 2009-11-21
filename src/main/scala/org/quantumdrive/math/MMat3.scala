package org.quantumdrive.math

import org.quantumdrive.math.mutable.MMat3Impl
import org.quantumdrive.math.mutable.MutableMatrix3

object MMat3 {
  final def apply(c00: Float, c10: Float, c20: Float,
                  c01: Float, c11: Float, c21: Float,
                  c02: Float, c12: Float, c22: Float): MutableMatrix3 =
    new MMat3Impl(c00, c10, c20,
                  c01, c11, c21,
                  c02, c12, c22)
  final def unapply(value: MutableMatrix3) =
    Some((value.c00, value.c10, value.c20,
          value.c01, value.c11, value.c21,
          value.c02, value.c12, value.c22))
}
