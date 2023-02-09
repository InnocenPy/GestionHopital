package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Medecin;
import com.hopital.GestionHopital.Repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedecinServiceImp implements MedecinService{
    @Autowired
    public final MedecinRepository medecinRepository;

    public MedecinServiceImp(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    @Override
    public Medecin create(Medecin medecin) {
        medecinRepository.save(medecin);
        return medecin;
    }

    @Override
    public List<Medecin> affiche() {
        return medecinRepository.findAll();
    }

    @Override
    public List<Medecin> lire() {
        return medecinRepository.findAll();
    }

    @Override
    public Optional<Medecin> modifier(Long id, Medecin medecin) {
        return medecinRepository.findById(id).map(p -> {
            p.setMedecin_id(p.getMedecin_id());
            p.setMedecin_address(p.getMedecin_address());
            p.setMedecin_email(p.getMedecin_email());
            p.setMedecin_name(p.getMedecin_name());
            p.setMedecin_notes(p.getMedecin_notes());
            p.setMedecin_phone(p.getMedecin_phone());
            p.setMedecin_specialization(p.getMedecin_specialization());

            return medecinRepository.save(p);

        });
    }

    @Override
    public String delete(Long id) {
        medecinRepository.deleteById(id);
        return "Medecin supprimer avec succee";
    }
}
