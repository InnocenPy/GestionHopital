package com.hopital.GestionHopital.Repository;

import com.hopital.GestionHopital.Entity.Medicaments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicaments, Long> {

}
