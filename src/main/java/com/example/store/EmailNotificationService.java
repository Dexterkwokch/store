package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private int port;

    public void send(String message, String recipientEmail) {
        System.out.println("Sending email to " + recipientEmail);
        System.out.println("Sending email to " + host + ":" + port);
        System.out.println("Sending message:" + message );
    }
}
