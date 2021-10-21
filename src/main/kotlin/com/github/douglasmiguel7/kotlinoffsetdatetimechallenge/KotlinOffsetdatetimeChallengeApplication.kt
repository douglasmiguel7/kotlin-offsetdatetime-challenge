package com.github.douglasmiguel7.kotlinoffsetdatetimechallenge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.OffsetDateTime
import java.time.ZoneOffset

@SpringBootApplication
class KotlinOffsetdatetimeChallengeApplication

fun OffsetDateTime.toUTC(): OffsetDateTime = this.withOffsetSameInstant(ZoneOffset.UTC)

fun main(args: Array<String>) {
	runApplication<KotlinOffsetdatetimeChallengeApplication>(*args)
}
