package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private final MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        System.out.println(messageService.getMessage());
    }
}
