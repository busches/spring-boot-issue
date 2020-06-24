package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate

@Disabled
@SpringBootTest
class PassingApplicationTests {
    @Autowired
    lateinit var namedParameterJdbcTemplate: NamedParameterJdbcTemplate

    @Test
    fun contextLoads() {
        assertEquals(true, true)
    }
}
