package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private final MessageProvider messageProvider;

    public NotificationService(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void sendNotification() {
        System.out.println(messageProvider.getMessage());
    }
}