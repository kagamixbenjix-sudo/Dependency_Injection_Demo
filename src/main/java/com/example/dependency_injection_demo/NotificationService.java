package com.example.dependency_injection_demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class NotificationService {

    private final MessageService messageService;

    @Autowired
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        System.out.println(messageService.getMessage());
    }
}
