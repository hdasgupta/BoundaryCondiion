package com.conditions.boundary.BoundaryConditions.tests

import com.conditions.boundary.BoundaryConditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FloatTest {

    val a = 6.0f
    val b = 2.0f

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), 8.0f)
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), 4.0f)
    }

    @Test
    fun mulTest() {
        Assertions.assertEquals(mul(a, b), 12.0f)
    }

    @Test
    fun divTest() {
        Assertions.assertEquals(div(a, b), 3.0f)
    }

    @Test
    fun powTest() {
        Assertions.assertEquals(pow(a, b), 36.0f)
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), 2.0f)
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), 6.0f)
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
        Assertions.assertArrayEquals(list.toTypedArray(), arrayOf(2.0f, 6.0f))
    }
}