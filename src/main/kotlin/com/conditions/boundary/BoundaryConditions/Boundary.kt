package com.conditions.boundary.BoundaryConditions

interface Boundary<T, U> {
    fun add(a: T, b: U): T
    fun sub(a: T, b: U): T
    fun min(a: T, b: T): T
    fun max(a: T, b: T): T
    fun gt(a: T, b: T): Boolean
    fun lt(a: T, b: T): Boolean
    fun gte(a: T, b: T): Boolean
    fun lte(a: T, b: T): Boolean
    fun eq(a: T, b: T): Boolean
    fun ne(a: T, b: T): Boolean
    fun comp(a: T, b: T): Long
    fun sort(list: List<T>)
}