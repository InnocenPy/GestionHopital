package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Facture;
import com.hopital.GestionHopital.Repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures")
public class FactureController {

    @Autowired
    private FactureRepository factureRepository;

    @GetMapping
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @GetMapping("/{id}")
    public Facture getFactureById(@PathVariable Long id) {
        return factureRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Facture nexiste pas"));
    }

    @PostMapping
    public Facture createFacture(@Validated @RequestBody Facture facture) {
        return factureRepository.save(facture);
    }

    @PutMapping("/{id}")
    public Facture updateFacture(@PathVariable Long id, @Validated @RequestBody Facture factureDetails) {
        Facture facture = factureRepository.findById(id)
                .orElseThrow();
        facture.setMontant(factureDetails.getMontant());
        facture.setDateFacture(factureDetails.getDateFacture());
        Facture updatedFacture = factureRepository.save(facture);
        return updatedFacture;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFacture(@PathVariable Long id) {
        Facture facture = factureRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Error de suppression"));
        factureRepository.delete(facture);
        return ResponseEntity.ok().build();
    }
}
