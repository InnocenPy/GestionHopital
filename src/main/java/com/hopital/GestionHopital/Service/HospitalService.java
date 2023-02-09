package com.hopital.GestionHopital.Service;

import org.springframework.stereotype.Service;

@Service
public class HospitalService {

//    @Autowired
//    private DoctorRepository doctorRepository;
//    @Autowired
//    private PatientRepository patientRepository;
//    @Autowired
//    private RoomRepository roomRepository;
//    @Autowired
//    private TestRepository testRepository;
//
//    public HospitalService() {
//    }
//
//    public List<Doctor> getAllDoctors() {
//        return doctorRepository.findAll();
//    }

//    public Doctor getDoctorById(Long id) {
//        return doctorRepository.findById(id).orElse(null);
//    }

//    public Doctor createDoctor(Doctor doctor) {
//        return doctorRepository.save(doctor);
//    }

//    public Doctor updateDoctor(Long id, Doctor doctorDetails) {
//        Doctor doctor = doctorRepository.findById(id).orElse(null);
//        if (doctor != null) {
//            doctor.setName(doctorDetails.getName());
//            doctor.setSpecialization(doctorDetails.getSpecialization());
//            doctor.setVisitingDays(doctorDetails.getVisitingDays());
//            doctor.setVisitingHours(doctorDetails.getVisitingHours());
//            doctorRepository.save(doctor);
//        }
//        return doctor;
//    }

//    public void deleteDoctor(Long id) {
//        doctorRepository.deleteById(id);
//    }

    // similar methods for Patient, Room, Test classes
}
