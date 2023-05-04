package com.kgisl.example.SpringbootJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
    private MyService myService;

    @BeforeEach
    public void setUp() {
        myService = new MyService();
    }

    @Test
    public void testGetGreeting() {
        String expectedMessage = "Hello World!";
        String actualMessage = myService.getGreeting();
        assertEquals(expectedMessage, actualMessage);
    }
}
