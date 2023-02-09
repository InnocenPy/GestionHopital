package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Medicaments;
import com.hopital.GestionHopital.Service.MedicamentsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/medicament")
public class MedicamentsController {

    @Autowired
    MedicamentsServiceImp medicamentsServiceImp;

//    @PostMapping("/create")
//    public Medicaments create(Medicaments medicaments){
//        return medicamentsServiceImp.create(medicaments);
//    }

//    @GetMapping("/read")
//    public List<Medicaments> read(){
//        return medicamentsServiceImp.read();
//    }
}
