package com.conditions.boundary.boundaryconditions.tests

import com.conditions.boundary.boundaryconditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.math.BigDecimal

@SpringBootTest
class BigDoubleTest {

    val a = BigDecimal("6.0")
    val b = BigDecimal("2.0")

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), BigDecimal("8.0"))
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), BigDecimal("4.0"))
    }

    @Test
    fun mulTest() {
        Assertions.assertEquals(mul(a, b), BigDecimal("12.00"))
    }

    @Test
    fun divTest() {
        Assertions.assertEquals(div(a, b), BigDecimal("3.0"))
    }

    @Test
    fun powTest() {
        Assertions.assertEquals(pow(a, b), BigDecimal("36.00"))
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), BigDecimal("2.0"))
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), BigDecimal("6.0"))
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