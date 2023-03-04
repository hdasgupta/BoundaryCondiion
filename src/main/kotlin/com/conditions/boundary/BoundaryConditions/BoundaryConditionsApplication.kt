package com.conditions.boundary.BoundaryConditions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoundaryConditionsApplication

fun main(args: Array<String>) {
	val ac = runApplication<BoundaryConditionsApplication>(*args)

}


