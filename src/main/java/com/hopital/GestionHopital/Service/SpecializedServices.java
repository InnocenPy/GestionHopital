package com.hopital.GestionHopital.Service;

import com.hopital.GestionHopital.Entity.SpecializedService;
import com.hopital.GestionHopital.Repository.SpecializedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecializedServices {

    @Autowired
    SpecializedRepository repo;

    //Logic
    public SpecializedService saveOrUpdateService(SpecializedService specializedService){
        return repo.save(specializedService);
    }

}
