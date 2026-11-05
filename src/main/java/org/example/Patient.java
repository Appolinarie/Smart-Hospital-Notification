

package org.example;

import java.time.LocalDate;

public class Patient {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String diagnosis;
    private LocalDate admissionDate;

    public Patient() {
    }

    public Patient(String name, int age, String gender, String phone, String diagnosis) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.diagnosis = diagnosis;
        this.admissionDate = LocalDate.now();
    }


    public Patient(int id, String name, int age, String gender, String phone,
                   String diagnosis, LocalDate admissionDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.diagnosis = diagnosis;
        this.admissionDate = admissionDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }



    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }


    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Age: %d | Gender: %s | Phone: %s | Diagnosis: %s | Admitted: %s",
                id, name, age, gender, phone, diagnosis, admissionDate);
    }
}
