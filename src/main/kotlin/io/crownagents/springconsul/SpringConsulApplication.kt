package io.crownagents.springconsul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringConsulApplication {

}

fun main(args: Array<String>) {
    runApplication<SpringConsulApplication>(*args)
}
