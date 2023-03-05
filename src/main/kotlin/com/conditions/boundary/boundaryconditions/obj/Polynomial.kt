package com.conditions.boundary.boundaryconditions.obj

import com.conditions.boundary.boundaryconditions.wrapper.add
import java.util.stream.Collectors
import java.util.stream.IntStream
import kotlin.math.max

class Polynomial(vararg coEff:Double):Comparable<Polynomial> {

    var numbers: MutableList<Double> = mutableListOf()

    init {
        numbers = coEff.toMutableList()
        while (numbers.last()==0.0) {
            numbers.removeLast()
        }
    }

    fun add(other: Polynomial) : Polynomial =
        Polynomial(
            *IntStream.range(0, max(numbers.size, other.numbers.size))
                .mapToObj {
                    if (numbers.size > it && other.numbers.size > it) {
                        numbers[it] + other.numbers[it]
                    } else if(numbers.size > it) {
                        numbers[it]
                    } else {
                        other.numbers[it]
                    }
                }
                .toList()
                .toDoubleArray()
        )



    fun sub(other: Polynomial) : Polynomial =
        Polynomial(
            *IntStream.range(0, max(numbers.size, other.numbers.size))
                .mapToObj {
                    if (numbers.size > it && other.numbers.size > it) {
                        numbers[it] - other.numbers[it]
                    } else if(numbers.size > it) {
                        numbers[it]
                    } else {
                        - other.numbers[it]
                    }
                }
                .toList()
                .toDoubleArray()
        )

    fun mul(other: Polynomial) : Polynomial =
        IntStream.range(0, numbers.size)
            .mapToObj {
                Polynomial(
                    *IntStream.range(0, other.numbers.size+it)
                        .mapToObj {
                                p->
                            if(p<it) {
                                0.0
                            } else {
                                numbers[it] * other.numbers[p-it]
                            }
                        }
                        .toList()
                        .toDoubleArray()
                )

            }
            .reduce { t, u -> add(t, u) }
            .get()


    fun gt(other: Polynomial) : Boolean =
        if(numbers.size>other.numbers.size) {
            true
        } else if(numbers.size==other.numbers.size) {
            val i = IntStream.iterate(numbers.size-1, fun(n)=n>0, fun(n)=n-1)
                .filter { numbers[it]!=other.numbers[it] }
                .findFirst()
                .asInt
            numbers[i]>other.numbers[i]
        } else {
            false
        }

    fun lt(other: Polynomial) : Boolean =
        if(numbers.size>other.numbers.size) {
            false
        } else if(numbers.size==other.numbers.size) {
            val i = IntStream.iterate(numbers.size-1, fun(n)=n>0, fun(n)=n-1)
                .filter { numbers[it]!=other.numbers[it] }
                .findFirst()
                .asInt
            numbers[i]<other.numbers[i]
        } else {
            true
        }


    override fun compareTo(other: Polynomial): Int =
        if(numbers.size>other.numbers.size) {
            numbers.last().compareTo(0)
        } else if(numbers.size<other.numbers.size) {
            0.compareTo(other.numbers.last())
        } else {
            numbers.last().compareTo(other.numbers.last())
        }

    override fun hashCode(): Int =
        numbers.reduce { acc, d -> acc + d }.hashCode()

    override fun equals(other: Any?): Boolean =
        if(other is Polynomial) {
            if(numbers == other.numbers) {
                !IntStream.range(0, numbers.size)
                    .anyMatch { !numbers[it].equals(other.numbers[it]) }
            } else {
                false
            }
        } else {
            false
        }


    override fun toString(): String =
        IntStream.iterate(numbers.size-1, fun(n)=n>=0, fun(n)=n-1)
            .mapToObj {
                if(numbers[it]!=0.0)
                    "${numbers[it]}${if(it>0) "*x^$it" else ""}"
                else
                    ""
            }
            .filter { it.isNotEmpty() }
            .collect(Collectors.joining(" + "))


}