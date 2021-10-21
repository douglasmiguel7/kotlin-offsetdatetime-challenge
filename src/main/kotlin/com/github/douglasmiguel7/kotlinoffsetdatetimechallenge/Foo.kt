package com.github.douglasmiguel7.kotlinoffsetdatetimechallenge

import org.hibernate.annotations.GenericGenerator
import java.time.OffsetDateTime
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class Foo (

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    val id: UUID?,

    val createdAt: OffsetDateTime?
)