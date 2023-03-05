package com.conditions.boundary.boundaryconditions.tests

import com.conditions.boundary.boundaryconditions.obj.Polynomial
import com.conditions.boundary.boundaryconditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PolynomialTest {

    val a = Polynomial(6.0, 3.0)
    val b = Polynomial(2.0, 7.0)

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), Polynomial(8.0, 10.0))
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), Polynomial(4.0, -4.0))
    }

    @Test
    fun mulTest() {
        Assertions.assertEquals(mul(a, b), Polynomial(12.0, 48.0, 21.0))
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), a)
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), b)
    }

    @Test
    fun eqTest() {
        Assertions.assertEquals(eq(a, b), false)
    }

    @Test
    fun lteTest() {
        Assertions.assertEquals(lte(a, b), true)
    }

    @Test
    fun neTest() {
        Assertions.assertEquals(ne(a, b), true)
    }

    @Test
    fun ltTest() {
        Assertions.assertEquals(lt(a, b), true)
    }

    @Test
    fun gtTest() {
        Assertions.assertEquals(gt(a, b), false)
    }

    @Test
    fun gteTest() {
        Assertions.assertEquals(gte(a, b), false)
    }

    @Test
    fun compTest() {
        Assertions.assertEquals(comp(a, b), -1)
    }

    @Test
    fun sortTest() {
        val list = listOf(a, b)
        sort(list)
        Assertions.assertArrayEquals(list.toTypedArray(), arrayOf(a, b))
    }
}