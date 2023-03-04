package com.conditions.boundary.boundaryconditions

interface BaseBoundary<T>: Boundary<T, T> {
    fun mul(a: T, b: T): T
    fun div(a: T, b: T): T
    fun pow(a: T, b: T): T
}