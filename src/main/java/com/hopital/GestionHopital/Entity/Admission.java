package com.hopital.GestionHopital.Entity;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

public class Admission {
    private int admission_id;
    private Date admission_date;
    private Time admission_time;
    private String admission_notes;
//    FOREIGN KEY (patient_id) REFERENCES Patients
}
