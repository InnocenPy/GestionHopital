package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.SpecializedService;
import com.hopital.GestionHopital.Service.SpecializedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class SpecializedController {
    @Autowired
    SpecializedServices specializedServices;

    @PostMapping("/create")
    public ResponseEntity<SpecializedService> createNewSpecialService(@RequestBody SpecializedService specializedService){
        return new ResponseEntity<SpecializedService>(HttpStatus.CREATED);
    }


}
