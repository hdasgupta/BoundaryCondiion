package com.conditions.boundary.boundaryconditions

import org.springframework.stereotype.Component
import java.util.*
import kotlin.math.pow

@Component
class LongBoundary: BaseBoundary<Long> {
    override fun add(a: Long, b: Long): Long = a + b

    override fun sub(a: Long, b: Long): Long = a - b

    override fun mul(a: Long, b: Long): Long = a * b

    override fun div(a: Long, b: Long): Long = a / b

    override fun min(a: Long, b: Long): Long = kotlin.math.min(a, b)

    override fun max(a: Long, b: Long): Long = kotlin.math.max(a, b)

    override fun pow(a: Long, b: Long): Long = a.toDouble().pow(b.toDouble()).toLong()

    override fun gt(a: Long, b: Long): Boolean = a > b

    override fun lt(a: Long, b: Long): Boolean = a < b

    override fun gte(a: Long, b: Long): Boolean = a >= b

    override fun lte(a: Long, b: Long): Boolean = a <= b

    override fun eq(a: Long, b: Long): Boolean = a == b

    override fun ne(a: Long, b: Long): Boolean = a != b

    override fun comp(a: Long, b: Long): Long = a.compareTo(b).toLong()

    override fun sort(list: List<Long>) = Collections.sort(list)

    override fun type(): String =
        Long::class.simpleName!!
}