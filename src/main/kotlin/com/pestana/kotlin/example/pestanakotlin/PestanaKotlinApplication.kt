package com.pestana.kotlin.example.pestanakotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class PestanaKotlinApplication

fun main(args: Array<String>) {
	runApplication<PestanaKotlinApplication>(*args)
}
