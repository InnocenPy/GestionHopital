package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Patient;
import com.hopital.GestionHopital.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientServiceImp implements PatientService {

    @Autowired
    private final PatientRepository patientRepository;


    @Override
    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> lire() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> modifier(Long id, Patient patient) {
        return Optional.ofNullable(patientRepository.findById(id).map(p -> {
            p.setPatient_id(p.getPatient_id());
            p.setPatient_name(p.getPatient_name());
            p.setPatient_address(p.getPatient_address());
            p.setPatient_dob(p.getPatient_dob());
            p.setPatient_email(p.getPatient_email());
            p.setPatient_phone(p.getPatient_phone());
            p.setPatient_notes(p.getPatient_notes());
            return patientRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("non trouve")));
    }

    @Override
    public String supprimer(Long id) {
        patientRepository.deleteById(id);
        return "Patient supprimer";
    }

//    Constructor


    public PatientServiceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}
