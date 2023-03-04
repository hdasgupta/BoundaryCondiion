package com.conditions.boundary.boundaryconditions.tests

import com.conditions.boundary.boundaryconditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StringTest {

    val a = "abc"
    val b = "b"

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b), "abcb")
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b), "ac")
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b), "abc")
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b), "b")
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