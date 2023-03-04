package com.conditions.boundary.boundaryconditions

import org.springframework.stereotype.Component
import java.util.*

@Component
class DateBoundary: Boundary<Date, Date> {
    override fun add(a: Date, b: Date): Date = Date(a.time+b.time)

    override fun sub(a: Date, b: Date): Date = Date(a.time-b.time)

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

    override fun type(): String =
        Date::class.simpleName!!
}