package com.kgisl.example.SpringbootJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class MyControllerTest {
    private MyController myController;

    @BeforeEach
    public void setUp() {
        myController = new MyController();
        myController.myService = new MyService();
    }

    @Test
    public void testGetGreeting() {
        ResponseEntity<String> response = myController.getGreeting();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello World!", response.getBody());
    }
}
