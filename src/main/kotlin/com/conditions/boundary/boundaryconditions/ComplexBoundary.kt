package com.conditions.boundary.boundaryconditions

import com.conditions.boundary.boundaryconditions.obj.Complex
import org.springframework.stereotype.Component
import java.util.*

@Component
class ComplexBoundary: BaseBoundary<Complex> {
    override fun add(a: Complex, b: Complex): Complex = Complex(a.n+b.n, a.i+b.i)

    override fun sub(a: Complex, b: Complex): Complex = Complex(a.n-b.n, a.i-b.i)

    override fun mul(a: Complex, b: Complex): Complex = Complex((a.n*b.n)-(a.i*b.i), (a.n*b.i)+(a.i*b.n))

    override fun div(a: Complex, b: Complex): Complex {
        val nu = mul(a, Complex(b.n, -b.i))
        val di = b.n*b.n+ b.i*b.i

        return Complex(nu.n/di, nu.i/di)
    }

    override fun min(a: Complex, b: Complex): Complex =
        if(gt(a, b))
            b
        else
            a

    override fun max(a: Complex, b: Complex): Complex =
        if(gt(a, b))
            a
        else
            b

    override fun pow(a: Complex, b: Complex): Complex = TODO()

    override fun gt(a: Complex, b: Complex): Boolean =
        a.n>b.n || a.n==b.n && a.i>b.i

    override fun lt(a: Complex, b: Complex): Boolean =
        a.n<b.n || a.n==b.n && a.i<b.i

    override fun gte(a: Complex, b: Complex): Boolean =
        a.n>=b.n || a.n==b.n && a.i>=b.i

    override fun lte(a: Complex, b: Complex): Boolean =
        a.n<=b.n || a.n==b.n && a.i<=b.i

    override fun eq(a: Complex, b: Complex): Boolean =
        a.n==b.n && a.i==b.i

    override fun ne(a: Complex, b: Complex): Boolean =
        a.n!=b.n || a.i!=b.i

    override fun comp(a: Complex, b: Complex): Long =
        a.compareTo(b).toLong()

    override fun sort(list: List<Complex>) = Collections.sort(list)
    override fun type(): String =
        Complex::class.java.simpleName
    
}