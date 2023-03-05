package com.conditions.boundary.boundaryconditions.obj

class Complex(val n: Double, val i: Double) :Comparable<Complex> {

    override fun compareTo(other: Complex): Int =
        if(n != other.n)
            n.compareTo(other.n)
        else
            i.compareTo(other.i)

    override fun hashCode(): Int =
        (n+i).hashCode()


    override fun equals(other: Any?): Boolean =
        if(other is Complex) {
            n==other.n && i==other.i
        } else {
            false
        }

    override fun toString(): String {
        val resultN = "$n "
        val resultI = "${if(i>0) "+ $i" else "- ${-i}"}i"

        return if(n==0.0 && i==0.0)
            n.toString()
        else if(n==0.0)
            resultI
        else if(i==0.0)
            resultN
        else
            resultN + resultI
    }

}