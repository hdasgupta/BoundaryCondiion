package com.conditions.boundary.BoundaryConditions

import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.util.Collections
import kotlin.math.pow

@Component
class BigDoubleBoundary: BaseBoundary<BigDecimal> {
    override fun add(a: BigDecimal, b: BigDecimal): BigDecimal = a + b

    override fun sub(a: BigDecimal, b: BigDecimal): BigDecimal = a - b

    override fun mul(a: BigDecimal, b: BigDecimal): BigDecimal = a * b

    override fun div(a: BigDecimal, b: BigDecimal): BigDecimal = a / b

    override fun min(a: BigDecimal, b: BigDecimal): BigDecimal = a.min(b)

    override fun max(a: BigDecimal, b: BigDecimal): BigDecimal = a.max(b)

    override fun pow(a: BigDecimal, b: BigDecimal): BigDecimal = a.pow(b.toInt())

    override fun gt(a: BigDecimal, b: BigDecimal): Boolean = a > b

    override fun lt(a: BigDecimal, b: BigDecimal): Boolean = a < b

    override fun gte(a: BigDecimal, b: BigDecimal): Boolean = a >= b

    override fun lte(a: BigDecimal, b: BigDecimal): Boolean = a <= b

    override fun eq(a: BigDecimal, b: BigDecimal): Boolean = a == b

    override fun ne(a: BigDecimal, b: BigDecimal): Boolean = a != b

    override fun comp(a: BigDecimal, b: BigDecimal): Long = a.compareTo(b).toLong()

    override fun sort(list: List<BigDecimal>) = Collections.sort(list)
    override fun type(): String =
        BigDecimal::class.java.simpleName
    
}