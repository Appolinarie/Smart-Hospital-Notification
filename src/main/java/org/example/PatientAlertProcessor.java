package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    @Autowired
    @Qualifier("Emergency")
    private NotificationService notification;

    @Autowired
    @Qualifier("Sms")
    private NotificationService notifications;

    @Value("${HOSPITAL_NAME}")
    private String hospitalName;

    public PatientAlertProcessor(NotificationService notification){
        this.notification = notification;
    }

    public void send(String patientId, String message){
        System.out.println("THIS HOSPITAL:" +hospitalName)
        notification.sendNotification(patientId, message);
    }
    public void send(String patientId,String message, String hospital){
        System.out.println("***THIS IS " + hospital + "***");
        notifications.sendNotification(patientId, message, hospital);
    }
}
