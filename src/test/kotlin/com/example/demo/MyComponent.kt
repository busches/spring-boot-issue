package com.example.demo

import org.springframework.boot.test.context.TestComponent
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate

@TestComponent
class MyComponent(
    private val namedParameterJdbcTemplate: NamedParameterJdbcTemplate
) {

}
