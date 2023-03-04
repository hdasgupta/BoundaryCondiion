package com.conditions.boundary.BoundaryConditions

import org.springframework.stereotype.Component
import java.math.BigInteger
import java.util.Collections
import kotlin.math.pow

@Component
class IntBoundary: BaseBoundary<Int> {
    override fun add(a: Int, b: Int): Int = a + b

    override fun sub(a: Int, b: Int): Int = a - b

    override fun mul(a: Int, b: Int): Int = a * b

    override fun div(a: Int, b: Int): Int = a / b

    override fun min(a: Int, b: Int): Int = kotlin.math.min(a, b)

    override fun max(a: Int, b: Int): Int = kotlin.math.max(a, b)

    override fun pow(a: Int, b: Int): Int = a.toDouble().pow(b.toDouble()).toInt()

    override fun gt(a: Int, b: Int): Boolean = a > b

    override fun lt(a: Int, b: Int): Boolean = a < b

    override fun gte(a: Int, b: Int): Boolean = a >= b

    override fun lte(a: Int, b: Int): Boolean = a <= b

    override fun eq(a: Int, b: Int): Boolean = a == b

    override fun ne(a: Int, b: Int): Boolean = a != b

    override fun comp(a: Int, b: Int): Long = a.compareTo(b).toLong()

    override fun sort(list: List<Int>) = Collections.sort(list)

    override fun type(): String =
        Int::class.simpleName!!
}