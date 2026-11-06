package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyUrgentNotificationService implements NotificationService {

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Override
    public void sendNotification(Patient patient, String message) {
        System.err.println("[CRITICAL ICU EMERGENCY] [" + hospitalName + "] Dispatching urgent alert for Patient: "
                + patient.getName() + " [ID: " + patient.getId() + ", Phone: " + patient.getPhoneNumber() + "]");
        System.err.println("URGENT MESSAGE: " + message);
    }
}
