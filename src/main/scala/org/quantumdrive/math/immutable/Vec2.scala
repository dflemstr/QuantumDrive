package org.quantumdrive.math.immutable

import org.quantumdrive.math.VectorArithmetic2

/**
 * An ImmutableVector2 implementation that is used both in Scala and Java.
 * The Scala version has some additional nicities, such as operator support and
 * optimized versions of some common vector operations.
 */
case class Vec2(val x: Float, val y: Float) extends ImmutableVector2 with VectorArithmetic2
