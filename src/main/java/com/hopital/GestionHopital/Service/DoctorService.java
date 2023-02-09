package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Doctors;

import java.util.Optional;

public interface DoctorService {
    Optional<Doctors> findDoctorsBySpecialization(Long id);

    Doctors create(Doctors doctors);


}
