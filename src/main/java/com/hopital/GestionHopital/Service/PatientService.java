package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    Patient create(Patient patient);

    List<Patient> lire();

    Optional<Patient> modifier(Long id, Patient patient);

    String supprimer(Long id);
}
