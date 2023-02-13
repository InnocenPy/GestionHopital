package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.Admission;
import com.hopital.GestionHopital.Repository.AdmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class AdmissionServiceImpl implements AdmissionService{

    @Autowired
    private final AdmissionRepository repository;

    public AdmissionServiceImpl(AdmissionRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createAdmission(Admission admission) {
        repository.save(admission);
    }

    @Override
    public void updateAdmission(int id, Admission admission) {
        repository.findById(id).map((p->{
            p.setAdmission_id(p.getAdmission_id());
            p.setAdmission_date(p.getAdmission_date());
            p.setAdmission_notes(p.getAdmission_notes());
            p.setAdmission_time(p.getAdmission_time());
            return repository.save(p);
        }));
    }

    @Override
    public void deleteAdmission(int id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<Admission> getAdmissions() {
        List<Admission> allAdmission = repository.findAll();
        return allAdmission;
    }
}
