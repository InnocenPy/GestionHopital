package com.hopital.GestionHopital.Entity;

import javax.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctors {

    @Id
//    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctor_id;
    private String doctor_name;
    private String doctor_specialization;
    private String doctor_address;
    private int doctor_phone;
    private String doctor_email;
    private String doctor_notes;
    // champs relatifs aux médecins

    // Constructor

    public Doctors() {
    }

    public Doctors(long doctor_id,
                   String doctor_name,
                   String doctor_specialization,
                   String doctor_address,
                   int doctor_phone,
                   String doctor_email,
                   String doctor_notes) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.doctor_specialization = doctor_specialization;
        this.doctor_address = doctor_address;
        this.doctor_phone = doctor_phone;
        this.doctor_email = doctor_email;
        this.doctor_notes = doctor_notes;
    }
    // Getter Et Setters


    public long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_specialization() {
        return doctor_specialization;
    }

    public void setDoctor_specialization(String doctor_specialization) {
        this.doctor_specialization = doctor_specialization;
    }

    public String getDoctor_address() {
        return doctor_address;
    }

    public void setDoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }

    public int getDoctor_phone() {
        return doctor_phone;
    }

    public void setDoctor_phone(int doctor_phone) {
        this.doctor_phone = doctor_phone;
    }

    public String getDoctor_email() {
        return doctor_email;
    }

    public void setDoctor_email(String doctor_email) {
        this.doctor_email = doctor_email;
    }

    public String getDoctor_notes() {
        return doctor_notes;
    }

    public void setDoctor_notes(String doctor_notes) {
        this.doctor_notes = doctor_notes;
    }
}
