package com.conditions.boundary.BoundaryConditions

import java.util.*
import kotlin.math.pow

class DateBoundary: Boundary<Date, Long> {
    override fun add(a: Date, b: Long): Date = Date(a.time+b)

    override fun sub(a: Date, b: Long): Date = Date(a.time-b)

    override fun min(a: Date, b: Date): Date = if(a < b) a else b

    override fun max(a: Date, b: Date): Date = if(a > b) a else b

    override fun gt(a: Date, b: Date): Boolean = a > b

    override fun lt(a: Date, b: Date): Boolean = a < b

    override fun gte(a: Date, b: Date): Boolean = a >= b

    override fun lte(a: Date, b: Date): Boolean = a <= b

    override fun eq(a: Date, b: Date): Boolean = a == b

    override fun ne(a: Date, b: Date): Boolean = a != b

    override fun comp(a: Date, b: Date): Long = a.compareTo(b).toLong()

    override fun sort(list: List<Date>) = Collections.sort(list)
}