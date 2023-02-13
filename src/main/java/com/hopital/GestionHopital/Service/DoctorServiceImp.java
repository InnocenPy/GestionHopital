package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Doctors;
import com.hopital.GestionHopital.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImp implements DoctorService{

    @Autowired
    private final DoctorRepository doctorRepository;

    // Constructor
    public DoctorServiceImp(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


    @Override
    public Optional<Doctors> findDoctorsBySpecialization(Long id) {
        return doctorRepository.findById(id);
    }

    @Override
    public Doctors create(Doctors doctors) {
        return doctorRepository.save(doctors);
    }
}
