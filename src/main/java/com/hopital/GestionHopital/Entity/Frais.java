package com.hopital.GestionHopital.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "frais")
public class Frais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int somme;
    private Date date;



    //D' autre champs |



//    Constructor


    public Frais() {
    }

    public Frais(long id, int somme, Date date) {
        this.id = id;
        this.somme = somme;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSomme() {
        return somme;
    }

    public void setSomme(int somme) {
        this.somme = somme;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
