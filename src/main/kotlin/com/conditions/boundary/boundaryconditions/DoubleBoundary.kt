package com.conditions.boundary.boundaryconditions

import org.springframework.stereotype.Component
import java.util.*
import kotlin.math.pow

@Component
class DoubleBoundary: BaseBoundary<Double> {
    override fun add(a: Double, b: Double): Double = a + b

    override fun sub(a: Double, b: Double): Double = a - b

    override fun mul(a: Double, b: Double): Double = a * b

    override fun div(a: Double, b: Double): Double = a / b

    override fun min(a: Double, b: Double): Double = kotlin.math.min(a, b)

    override fun max(a: Double, b: Double): Double = kotlin.math.max(a, b)

    override fun pow(a: Double, b: Double): Double = a.pow(b)

    override fun gt(a: Double, b: Double): Boolean = a > b

    override fun lt(a: Double, b: Double): Boolean = a < b

    override fun gte(a: Double, b: Double): Boolean = a >= b

    override fun lte(a: Double, b: Double): Boolean = a <= b

    override fun eq(a: Double, b: Double): Boolean = a == b

    override fun ne(a: Double, b: Double): Boolean = a != b

    override fun comp(a: Double, b: Double): Long = a.compareTo(b).toLong()

    override fun sort(list: List<Double>) = Collections.sort(list)

    override fun type(): String =
        Double::class.simpleName!!
}