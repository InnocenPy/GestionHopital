package com.hopital.GestionHopital.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rendezvous{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Date appointmentDate;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctors doctor;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
