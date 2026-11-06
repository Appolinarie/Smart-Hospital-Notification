package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartHospitalApplication implements CommandLineRunner {

    private final PatientAlertProcessor alertProcessor;

    public SmartHospitalApplication(PatientAlertProcessor alertProcessor) {
        this.alertProcessor = alertProcessor;
    }

    public static void main(String[] args) {
        SpringApplication.run(SmartHospitalApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Patient routinePatient = new Patient("P-90210", "John Doe", "555-0199", "john.doe@example.com");
        Patient icuPatient = new Patient("ICU-404", "Jane Smith", "555-0142", "jane.smith@example.com");

        alertProcessor.processRoutineAlert(routinePatient, "Your general checkup appointment is scheduled for next Tuesday.");
        System.out.println();
        alertProcessor.processCriticalIcuAlert(icuPatient, "Vitals unstable in Bed 4! Immediate medical attention required.");
    }
}