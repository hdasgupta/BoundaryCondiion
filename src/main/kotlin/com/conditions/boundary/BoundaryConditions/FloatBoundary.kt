package com.conditions.boundary.BoundaryConditions

import java.util.Collections
import kotlin.math.pow

class FloatBoundary: BaseBoundary<Float> {
    override fun add(a: Float, b: Float): Float = a + b

    override fun sub(a: Float, b: Float): Float = a - b

    override fun mul(a: Float, b: Float): Float = a * b

    override fun div(a: Float, b: Float): Float = a / b

    override fun min(a: Float, b: Float): Float = kotlin.math.min(a, b)

    override fun max(a: Float, b: Float): Float = kotlin.math.max(a, b)

    override fun pow(a: Float, b: Float): Float = a.pow(b)

    override fun gt(a: Float, b: Float): Boolean = a > b

    override fun lt(a: Float, b: Float): Boolean = a < b

    override fun gte(a: Float, b: Float): Boolean = a >= b

    override fun lte(a: Float, b: Float): Boolean = a <= b

    override fun eq(a: Float, b: Float): Boolean = a == b

    override fun ne(a: Float, b: Float): Boolean = a != b

    override fun comp(a: Float, b: Float): Long = a.compareTo(b).toLong()

    override fun sort(list: List<Float>) = Collections.sort(list)
}