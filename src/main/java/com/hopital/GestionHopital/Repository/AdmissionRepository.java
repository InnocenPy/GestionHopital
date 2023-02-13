package com.hopital.GestionHopital.Repository;

import com.hopital.GestionHopital.Entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionRepository extends JpaRepository<Admission, Integer> {
}
