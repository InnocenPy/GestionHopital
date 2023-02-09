package com.hopital.GestionHopital.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Testes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date testDate;
    // d'autres champs relatifs aux tests

    // constructeurs, getters et setters
}
