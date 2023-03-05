package com.conditions.boundary.boundaryconditions.tests

import com.conditions.boundary.boundaryconditions.obj.Complex
import com.conditions.boundary.boundaryconditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ComplexTest {

    val a = Complex(6.0, 3.0)
    val b = Complex(2.0, 7.0)

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), Complex(8.0, 10.0))
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), Complex(4.0, -4.0))
    }

    @Test
    fun mulTest() {
        Assertions.assertEquals(mul(a, b), Complex(-9.0, 48.0))
    }

    @Test
    fun divTest() {
        Assertions.assertEquals(div(a, b), Complex(0.6226415094339622, -0.6792452830188679))
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), b)
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), a)
    }

    @Test
    fun eqTest() {
        Assertions.assertEquals(eq(a, b), false)
    }

    @Test
    fun lteTest() {
        Assertions.assertEquals(lte(a, b), false)
    }

    @Test
    fun neTest() {
        Assertions.assertEquals(ne(a, b), true)
    }

    @Test
    fun ltTest() {
        Assertions.assertEquals(lt(a, b), false)
    }

    @Test
    fun gtTest() {
        Assertions.assertEquals(gt(a, b), true)
    }

    @Test
    fun gteTest() {
        Assertions.assertEquals(gte(a, b), true)
    }

    @Test
    fun compTest() {
        Assertions.assertEquals(comp(a, b), 1)
    }

    @Test
    fun sortTest() {
        val list = listOf(a, b)
        sort(list)
        Assertions.assertArrayEquals(list.toTypedArray(), arrayOf(b, a))
    }
}