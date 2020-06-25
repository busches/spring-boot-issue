package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [DemoApplication::class, MyComponent::class])
class FailingApplicationTests {
    @Autowired
    lateinit var myComponent: MyComponent

    @Test
    fun contextLoads() {
        assertEquals(true, true)
    }
}
