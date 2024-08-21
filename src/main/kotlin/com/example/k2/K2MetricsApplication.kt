package com.example.k2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K2MetricsApplication

fun main(args: Array<String>) {
	runApplication<K2MetricsApplication>(*args)
}
