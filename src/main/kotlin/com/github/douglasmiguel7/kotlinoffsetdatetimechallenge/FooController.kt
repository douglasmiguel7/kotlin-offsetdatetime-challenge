package com.github.douglasmiguel7.kotlinoffsetdatetimechallenge

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.util.UUID

@RestController
@RequestMapping("/foos")
class FooController(
    val repository: FooRepository
) {

    @PostMapping("/utc-on")
    fun utcOn(): Foo {
        val foo = Foo(
            id = null,
            createdAt = OffsetDateTime.now().toUTC()
        )

        repository.save(foo)

        println(foo) // Ouptut sample: Foo(id=<random value>, createdAt=2021-10-21T19:25:54.020790Z)

        return foo
    }

    @PostMapping("/utc-off")
    fun utcOff(): Foo {
        val foo = Foo(
            id = null,
            createdAt = OffsetDateTime.now()
        )

        repository.save(foo)

        println(foo) // Ouptut sample: Foo(id=<random value>, createdAt=2021-10-21T16:28:11.144761-03:00)

        return foo
    }

    @GetMapping("/{id}")
    fun get(id: UUID): Foo {
        val foo = repository.getById(id)

        println(foo) // Ouptut sample: Foo(id=<random value>, createdAt=2021-10-21T16:28:11.144761-03:00)

        return foo
    }

    @GetMapping
    fun list(): List<Foo> = repository.findAll()

}