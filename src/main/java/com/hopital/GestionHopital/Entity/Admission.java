package com.hopital.GestionHopital.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Admission {

    @Id
    private Integer admission_id;
    private Date admission_date = new Date();
    private Time admission_time;
    private String admission_notes;
//    FOREIGN KEY (patient_id) REFERENCES Patients

    //Constructor

    public Admission() {
    }

    public Admission(int admission_id, Date admission_date, Time admission_time, String admission_notes) {
        this.admission_id = admission_id;
        this.admission_date = admission_date;
        this.admission_time = admission_time;
        this.admission_notes = admission_notes;
    }
    //Getter and Setter

    public int getAdmission_id() {
        return admission_id;
    }

    public void setAdmission_id(int admission_id) {
        this.admission_id = admission_id;
    }

    public Date getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(Date admission_date) {
        this.admission_date = admission_date;
    }

    public Time getAdmission_time() {
        return admission_time;
    }

    public void setAdmission_time(Time admission_time) {
        this.admission_time = admission_time;
    }

    public String getAdmission_notes() {
        return admission_notes;
    }

    public void setAdmission_notes(String admission_notes) {
        this.admission_notes = admission_notes;
    }
}
