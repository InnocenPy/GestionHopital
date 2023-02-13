package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Patient;
import com.hopital.GestionHopital.Service.MedecinService;
import com.hopital.GestionHopital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
//@Controller
@RequestMapping("/patient")
public class PatientsController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private MedecinService medecinService;

    public PatientsController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/create")
    public Patient create(@RequestBody Patient patient){

        return patientService.create(patient);
    }
    @GetMapping("/read")
    public List<Patient> lire(){
        return patientService.lire();
    }

    @PutMapping("/{id}")
    public Optional<Patient> modifier(@PathVariable Long id, @RequestBody Patient patient){
        return patientService.modifier(id,patient);
    }
    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id){
        return patientService.supprimer(id);
    }


}

