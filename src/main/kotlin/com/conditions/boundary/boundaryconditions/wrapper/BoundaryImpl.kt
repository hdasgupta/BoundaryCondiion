package com.conditions.boundary.boundaryconditions.wrapper

import com.conditions.boundary.boundaryconditions.BaseBoundary
import com.conditions.boundary.boundaryconditions.Boundary
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component
import java.util.stream.Collectors

var types: Map<String, Boundary<*, *>>? = null

@Component
class BoundaryImpl: ApplicationContextAware {
    @Autowired
    lateinit var boundary: List<Boundary<*, *>>

    fun types(): Map<String, Boundary<*, *>> =
        boundary!!.stream()
            .collect(
                Collectors.toMap(
                    fun(b: Boundary<*, *>) = b.type(),
                    fun(b: Boundary<*, *>) = b)
            )

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        types = types()
    }

}


inline fun <reified T> add(a: T, b: T): T =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .add(a, b)

inline fun <reified T> sub(a: T, b: T): T =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .sub(a, b)

inline fun <reified T> mul(a: T, b: T): T =
    (types!![T::class.simpleName] as BaseBoundary<T>)
        .mul(a, b)

inline fun <reified T> div(a: T, b: T): T =
    (types!![T::class.simpleName] as BaseBoundary<T>)
        .div(a, b)

inline fun <reified T> pow(a: T, b: T): T =
    (types!![T::class.simpleName] as BaseBoundary<T>)
        .pow(a, b)

inline fun <reified T> min(a: T, b: T): T =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .min(a, b)

inline fun <reified T> max(a: T, b: T): T =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .max(a, b)

inline fun <reified T> gt(a: T, b: T): Boolean =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .gt(a, b)

inline fun <reified T> lt(a: T, b: T): Boolean =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .lt(a, b)

inline fun <reified T> gte(a: T, b: T): Boolean =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .gte(a, b)

inline fun <reified T> lte(a: T, b: T): Boolean =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .lte(a, b)

inline fun <reified T> eq(a: T, b: T): Boolean =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .eq(a, b)

inline fun <reified T> ne(a: T, b: T): Boolean =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .ne(a, b)

inline fun <reified T> comp(a: T, b: T): Long =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .comp(a, b)

inline fun <reified T> sort(list: List<T>) =
    (types!![T::class.simpleName] as Boundary<T, T>)
        .sort(list)
