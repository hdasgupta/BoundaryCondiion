package com.conditions.boundary.boundaryconditions.tests

import com.conditions.boundary.boundaryconditions.wrapper.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

@SpringBootTest
class DateTest {

    val a = Date(LocalDateTime.of(2023,2,28,12,30, 0).toEpochSecond(ZoneOffset.UTC)*1000)
    val b = Date(LocalDateTime.of(2022,10,2,17,0, 0).toEpochSecond(ZoneOffset.UTC)*1000)

    @Test
    fun addTest() {
        Assertions.assertEquals(add(a, b).time, 3342317400000)
    }

    @Test
    fun subTest() {
        Assertions.assertEquals(sub(a, b).time, 12857400000)
    }

    @Test
    fun minTest() {
        Assertions.assertEquals(min(a, b).time, 1664730000000)
    }

    @Test
    fun maxTest() {
        Assertions.assertEquals(max(a, b).time, 1677587400000)
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