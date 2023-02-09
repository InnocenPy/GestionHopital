package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Medecin;
import com.hopital.GestionHopital.Entity.Patient;
import com.hopital.GestionHopital.Repository.MedecinRepository;
import com.hopital.GestionHopital.Service.MedecinService;
import com.hopital.GestionHopital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@Controller
@RequestMapping("/")
public class PagesController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private MedecinService medecinService;

    public PagesController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patient/create")
    public Patient create(@RequestBody Patient patient){

        return patientService.create(patient);
    }
    @GetMapping("/patient/read")
    public List<Patient> lire(){
        return patientService.lire();
    }

    @PutMapping("/patient/update/{id}")
    public Optional<Patient> modifier(@PathVariable Long id, @RequestBody Patient patient){
        return patientService.modifier(id,patient);
    }
    @DeleteMapping("/patient/delete/{id}")
    public String supprimer(@PathVariable Long id){
        return patientService.supprimer(id);
    }

    @PostMapping("/medecin/create")
    public Medecin create(Medecin medecin) {
    return medecinService.create(medecin);
    }

    @GetMapping("/medecin/read")
    public List<Medecin> affiche(){
        return medecinService.affiche();
    }
    public List<Medecin> lirer(){
        return medecinService.lire();
    }
}

