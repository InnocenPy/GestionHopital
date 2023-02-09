package com.hopital.GestionHopital.Entity;

import javax.persistence.*;

@Entity
@Table(name = "complementary_tests")
public class ComplementaryTest {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "cost")
        private Double cost;

        // Getters and setters
}
