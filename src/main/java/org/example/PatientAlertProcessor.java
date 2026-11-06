package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    private final NotificationService defaultNotificationService;
    private final NotificationService emergencyNotificationService;

    @Autowired
    public PatientAlertProcessor(
            NotificationService defaultNotificationService,
            @Qualifier("emergencyService") NotificationService emergencyNotificationService) {
        this.defaultNotificationService = defaultNotificationService;
        this.emergencyNotificationService = emergencyNotificationService;
    }

    public void processRoutineAlert(Patient patient, String message) {
        System.out.println("--- Processing Routine Communication ---");
        defaultNotificationService.sendNotification(patient, message);
    }

    public void processCriticalIcuAlert(Patient patient, String message) {
        System.out.println("--- Processing Critical ICU Alert ---");
        emergencyNotificationService.sendNotification(patient, message);
    }
}
