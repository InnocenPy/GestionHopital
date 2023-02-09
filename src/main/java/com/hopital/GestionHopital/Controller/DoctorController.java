package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Doctors;
import com.hopital.GestionHopital.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private final DoctorService doctorService;


    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/specialization/{id}")
    public Optional<Doctors> getDoctorsBySpecialization(@PathVariable Long id) {
        return doctorService.findDoctorsBySpecialization(id);
    }

    @PostMapping("/create")
    public Doctors getDoctors(Doctors doctors){
        return doctorService.create(doctors);
    }

}
