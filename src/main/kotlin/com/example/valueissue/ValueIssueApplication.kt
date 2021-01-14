package com.example.valueissue

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

@SpringBootApplication
class ValueIssueApplication

fun main(args: Array<String>) {
    runApplication<ValueIssueApplication>(*args)
}

@Service
class FooService(
    @Value("foo.bar")
    val bar: String
)
