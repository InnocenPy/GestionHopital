package com.hopital.GestionHopital.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long medecin_id;
    private String medecin_name;
    private String medecin_specialization;
    private String medecin_address;
    private int medecin_phone;
    private String medecin_email;
    private String medecin_notes;


//    Constructor
    public Medecin() {
    }

    public Medecin(String medecin_name, String medecin_specialization, String medecin_address, int medecin_phone, String medecin_email, String medecin_notes) {
        this.medecin_name = medecin_name;
        this.medecin_specialization = medecin_specialization;
        this.medecin_address = medecin_address;
        this.medecin_phone = medecin_phone;
        this.medecin_email = medecin_email;
        this.medecin_notes = medecin_notes;
    }
    //    Setter and Getter


    public long getMedecin_id() {
        return medecin_id;
    }

    public void setMedecin_id(long medecin_id) {
        this.medecin_id = medecin_id;
    }

    public String getMedecin_name() {
        return medecin_name;
    }

    public void setMedecin_name(String medecin_name) {
        this.medecin_name = medecin_name;
    }

    public String getMedecin_specialization() {
        return medecin_specialization;
    }

    public void setMedecin_specialization(String medecin_specialization) {
        this.medecin_specialization = medecin_specialization;
    }

    public String getMedecin_address() {
        return medecin_address;
    }

    public void setMedecin_address(String medecin_address) {
        this.medecin_address = medecin_address;
    }

    public int getMedecin_phone() {
        return medecin_phone;
    }

    public void setMedecin_phone(int medecin_phone) {
        this.medecin_phone = medecin_phone;
    }

    public String getMedecin_email() {
        return medecin_email;
    }

    public void setMedecin_email(String medecin_email) {
        this.medecin_email = medecin_email;
    }

    public String getMedecin_notes() {
        return medecin_notes;
    }

    public void setMedecin_notes(String medecin_notes) {
        this.medecin_notes = medecin_notes;
    }
}
