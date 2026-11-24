
package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage() {
        return "Hello! Welcome to Dependency Injection.";
    }
}
