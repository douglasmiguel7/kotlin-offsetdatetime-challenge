package com.github.douglasmiguel7.kotlinoffsetdatetimechallenge

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface FooRepository : JpaRepository<Foo, UUID>