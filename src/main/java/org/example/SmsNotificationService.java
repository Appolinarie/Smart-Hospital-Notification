package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET:DEFAULT_SECRET}")
    private String apiSecret;

    @Override
    public void sendNotification(PatientId, String message) {
        System.out.println("[SMS SERVICE] [" + hospitalName + "] Sending SMS to " + patient.getName() + " at Phone: " + patient.getPhoneNumber());

    }


}