package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class MessageService implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello! Welcome to Dependency Injection.";
    }
}