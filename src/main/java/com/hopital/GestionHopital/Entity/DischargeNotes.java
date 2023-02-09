package com.hopital.GestionHopital.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "discharge_notes")
public class DischargeNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dischargeDate;
    private double feesPaid;
    // d'autres champs relatifs aux billets de sortie

    // constructeurs, getters et setters

}
