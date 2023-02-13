package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Admission;

import java.util.Collection;

public interface AdmissionService {
    public  abstract void createAdmission(Admission admission);

    public  abstract void updateAdmission(int id, Admission admission);

    public  abstract void deleteAdmission(int id);

    public  abstract Collection<Admission> getAdmissions();
}
