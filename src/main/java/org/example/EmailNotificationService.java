package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(Patient patient, String message) {
        System.out.println("[EMAIL SERVICE] Sending routine email to " + patient.getName()
                + " (Email: " + patient.getEmail() + ", ID: " + patient.getId() + ")");
        System.out.println("Message: " + message);
}
