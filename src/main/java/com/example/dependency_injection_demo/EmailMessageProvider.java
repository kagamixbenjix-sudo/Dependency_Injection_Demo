package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello! This is an email notification.";
    }
}