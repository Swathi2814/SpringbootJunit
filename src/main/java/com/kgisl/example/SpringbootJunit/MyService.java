package com.kgisl.example.SpringbootJunit;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getGreeting() {
        return "Hello World!";
    }

}
