package io.joergi.demopom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemopomApplication

fun main(args: Array<String>) {
	runApplication<DemopomApplication>(*args)
	println("hello world from maven!")
}
