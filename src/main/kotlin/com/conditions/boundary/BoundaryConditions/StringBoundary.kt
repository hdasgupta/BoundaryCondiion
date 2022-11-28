package com.conditions.boundary.BoundaryConditions

import java.util.*
import kotlin.math.pow

class StringBoundary: Boundary<String, Long> {

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

    override fun add(a: String, b: Long): String {
        TODO("Not yet implemented")
    }

    override fun sub(a: String, b: Long): String {
        TODO("Not yet implemented")
    }
}