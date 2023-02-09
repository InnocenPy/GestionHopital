package com.hopital.GestionHopital.Repository;

import com.hopital.GestionHopital.Entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DoctorRepository extends JpaRepository<Doctors, Long> {
}
