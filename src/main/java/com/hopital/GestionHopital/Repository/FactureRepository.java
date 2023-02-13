package com.hopital.GestionHopital.Repository;

import com.hopital.GestionHopital.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {

}
