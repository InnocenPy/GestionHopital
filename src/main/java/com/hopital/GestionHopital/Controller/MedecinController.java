package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Medecin;
import com.hopital.GestionHopital.Service.MedecinServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@Controller
@RestController
@RequestMapping("medecin")
public class MedecinController {

    @Autowired
    MedecinServiceImp service;

    @PostMapping("/create")
    public Medecin create(@RequestBody Medecin medecin) {
        return service.create(medecin);
    }

    @GetMapping("/read")
    public List<Medecin> affiche(){
        return service.affiche();
    }
    @PutMapping("modifier")
    public Optional<Medecin> modifMed(@RequestBody Medecin medecin, Long id){
        return service.modifier(id, medecin);
    }

    @GetMapping("/lire")
    public List<Medecin> lirer(){
        return service.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMedecin(@PathVariable long id){
        service.delete(id);
        return "Medecin supprime";
    }
}
