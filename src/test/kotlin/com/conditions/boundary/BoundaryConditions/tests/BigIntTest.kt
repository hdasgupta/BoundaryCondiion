package com.conditions.boundary.BoundaryConditions.tests

import com.conditions.boundary.BoundaryConditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.math.BigInteger

@SpringBootTest
class BigIntTest {

    val a = BigInteger("6")
    val b = BigInteger("2")

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), BigInteger("8"))
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), BigInteger("4"))
    }

    @Test
    fun mulTest() {
        Assertions.assertEquals(mul(a, b), BigInteger("12"))
    }

    @Test
    fun divTest() {
        Assertions.assertEquals(div(a, b), BigInteger("3"))
    }

    @Test
    fun powTest() {
        Assertions.assertEquals(pow(a, b), BigInteger("36"))
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), BigInteger("2"))
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), BigInteger("6"))
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