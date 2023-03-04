package com.conditions.boundary.BoundaryConditions

import org.springframework.stereotype.Component
import java.math.BigInteger
import java.util.*
import kotlin.math.pow

@Component
class StringBoundary: Boundary<String, String> {

    override fun min(a: String, b: String): String = if(a < b) a else b

    override fun max(a: String, b: String): String = if(a > b) a else b

    override fun gt(a: String, b: String): Boolean = a > b

    override fun lt(a: String, b: String): Boolean = a < b

    override fun gte(a: String, b: String): Boolean = a >= b

    override fun lte(a: String, b: String): Boolean = a <= b

    override fun eq(a: String, b: String): Boolean = a == b

    override fun ne(a: String, b: String): Boolean = a != b

    override fun comp(a: String, b: String): Long = a.compareTo(b).toLong()

    override fun sort(list: List<String>) = Collections.sort(list)

    override fun add(a: String, b: String): String = a + b

    override fun sub(a: String, b: String): String = a.replace(b, "")

    override fun type(): String =
        String::class.simpleName!!
}