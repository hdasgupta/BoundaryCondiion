package com.conditions.boundary.BoundaryConditions.tests

import com.conditions.boundary.BoundaryConditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class LongTest {

    val a = 6L
    val b = 2L

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), 8L)
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), 4L)
    }

    @Test
    fun mulTest() {
        Assertions.assertEquals(mul(a, b), 12L)
    }

    @Test
    fun divTest() {
        Assertions.assertEquals(div(a, b), 3L)
    }

    @Test
    fun powTest() {
        Assertions.assertEquals(pow(a, b), 36L)
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), 2L)
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), 6L)
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
        Assertions.assertArrayEquals(list.toTypedArray(), arrayOf(2L, 6L))
    }
}