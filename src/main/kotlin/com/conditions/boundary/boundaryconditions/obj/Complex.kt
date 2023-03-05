package com.conditions.boundary.boundaryconditions.obj

class Complex(val n: Double, val i: Double) :Comparable<Complex> {
    override fun compareTo(other: Complex): Int =
        if(n != other.n)
            n.compareTo(other.n)
        else
            i.compareTo(other.i)


    override fun equals(other: Any?): Boolean =
        if(other is Complex) {
            n==other.n && i==other.i
        } else {
            false
        }

    override fun toString(): String =
        "$n ${if(i>0) "+ $i" else "- ${-i}"}i"

}