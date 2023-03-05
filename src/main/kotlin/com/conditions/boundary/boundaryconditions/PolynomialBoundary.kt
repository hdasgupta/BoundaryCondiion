package com.conditions.boundary.boundaryconditions

import com.conditions.boundary.boundaryconditions.obj.Polynomial
import org.springframework.stereotype.Component
import java.util.*

@Component
class PolynomialBoundary: BaseBoundary<Polynomial> {
    override fun add(a: Polynomial, b: Polynomial): Polynomial = a.add(b)

    override fun sub(a: Polynomial, b: Polynomial): Polynomial = a.sub(b)

    override fun mul(a: Polynomial, b: Polynomial): Polynomial = a.mul(b)

    override fun div(a: Polynomial, b: Polynomial): Polynomial = TODO()

    override fun min(a: Polynomial, b: Polynomial): Polynomial = if(a.gt(b)) b else a

    override fun max(a: Polynomial, b: Polynomial): Polynomial = if(a.gt(b)) a else b

    override fun pow(a: Polynomial, b: Polynomial): Polynomial = TODO()

    override fun gt(a: Polynomial, b: Polynomial): Boolean = a.gt(b)

    override fun lt(a: Polynomial, b: Polynomial): Boolean = a.lt(b)

    override fun gte(a: Polynomial, b: Polynomial): Boolean = a.gt(b) || a == b

    override fun lte(a: Polynomial, b: Polynomial): Boolean = a.lt(b) || a == b

    override fun eq(a: Polynomial, b: Polynomial): Boolean = a == b

    override fun ne(a: Polynomial, b: Polynomial): Boolean = a != b

    override fun comp(a: Polynomial, b: Polynomial): Long = a.compareTo(b).toLong()

    override fun sort(list: List<Polynomial>) = Collections.sort(list)
    override fun type(): String =
        Polynomial::class.java.simpleName
    
}