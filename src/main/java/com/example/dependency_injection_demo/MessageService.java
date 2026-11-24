package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;

@Component
public class MessageService implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello! Welcome to Dependency Injection.";
    }
}
