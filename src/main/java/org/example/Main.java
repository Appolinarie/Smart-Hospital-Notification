package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    PatientAlertProcessor alert = context.getBean(PatientAlertProcessor.class);
    alert.send("patient-001AC", "PLEASE! ITS TIME FOR MEDICATION");


}