package com.hopital.GestionHopital.Entity;

import javax.persistence.*;

@Entity
@Table(name = "complementary_tests")
public class Medicaments {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "cost")
        private Double cost;


        //Constructor

        public Medicaments() {
        }

        public Medicaments(Long id, String name, Double cost) {
                this.id = id;
                this.name = name;
                this.cost = cost;
        }
        // Getters and setters



}
