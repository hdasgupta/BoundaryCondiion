package com.conditions.boundary.BoundaryConditions

import org.springframework.stereotype.Component
import java.math.BigInteger
import java.util.Collections
import kotlin.math.pow

@Component
class BigIntBoundary: BaseBoundary<BigInteger> {
    override fun add(a: BigInteger, b: BigInteger): BigInteger = a + b

    override fun sub(a: BigInteger, b: BigInteger): BigInteger = a - b

    override fun mul(a: BigInteger, b: BigInteger): BigInteger = a * b

    override fun div(a: BigInteger, b: BigInteger): BigInteger = a / b

    override fun min(a: BigInteger, b: BigInteger): BigInteger = a.min(b)

    override fun max(a: BigInteger, b: BigInteger): BigInteger = a.max(b)

    override fun pow(a: BigInteger, b: BigInteger): BigInteger = a.pow(b.toInt())

    override fun gt(a: BigInteger, b: BigInteger): Boolean = a > b

    override fun lt(a: BigInteger, b: BigInteger): Boolean = a < b

    override fun gte(a: BigInteger, b: BigInteger): Boolean = a >= b

    override fun lte(a: BigInteger, b: BigInteger): Boolean = a <= b

    override fun eq(a: BigInteger, b: BigInteger): Boolean = a == b

    override fun ne(a: BigInteger, b: BigInteger): Boolean = a != b

    override fun comp(a: BigInteger, b: BigInteger): Long = a.compareTo(b).toLong()

    override fun sort(list: List<BigInteger>) = Collections.sort(list)
    override fun type(): String =
        BigInteger::class.java.simpleName
}