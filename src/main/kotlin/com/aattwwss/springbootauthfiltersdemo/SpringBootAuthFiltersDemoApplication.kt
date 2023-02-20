package com.aattwwss.springbootauthfiltersdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class SpringBootAuthFiltersDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringBootAuthFiltersDemoApplication>(*args)
}
