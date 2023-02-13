package com.hopital.GestionHopital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patient_id ;
    private String patient_name;
    private String patient_address;
    private Integer patient_phone;
    private LocalDate patient_dob;
    private String patient_email;
    private String patient_genre;
    private String patient_notes;

//   Constructor

    public Patient() {
    }

    public Patient(Long patient_id, String patient_name, String patient_address, Integer patient_phone, LocalDate patient_dob, String patient_email,String patient_genre, String patient_notes) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_address = patient_address;
        this.patient_phone = patient_phone;
        this.patient_dob = patient_dob;
        this.patient_email = patient_email;
        this.patient_notes = patient_notes;
        this.patient_genre = patient_genre;
    }

//    Getter & Setter

    public long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public int getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(Integer patient_phone) {
        this.patient_phone = patient_phone;
    }

    public LocalDate getPatient_dob() {
        return patient_dob;
    }

    public void setPatient_dob(LocalDate patient_dob) {
        this.patient_dob = patient_dob;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public String getPatient_genre() {
        return patient_genre;
    }

    public void setPatient_genre(String patient_genre) {
        this.patient_genre = patient_genre;
    }

    public String getPatient_notes() {
        return patient_notes;
    }

    public void setPatient_notes(String patient_notes) {
        this.patient_notes = patient_notes;
    }
}