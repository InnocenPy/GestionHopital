package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Medecin;

import java.util.List;
import java.util.Optional;

public interface MedecinService {

     Medecin create(Medecin medecin);

     List<Medecin> affiche();

     List<Medecin> lire();

     Optional<Medecin> modifier(Long id, Medecin medecin);

     String delete(Long id);


}
