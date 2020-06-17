package com.felix.test.subproject

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SubprojectApplication

fun main(args: Array<String>) {
	runApplication<SubprojectApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
