package io.crownagents.springconsul

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
@Service
class DatabaseService(@Value("\${db-url}") val dbUrl: String) {
    val log: Logger = LoggerFactory.getLogger(this::class.java)
    init {
        log.info(dbUrl)
    }
}