package com.hopital.GestionHopital.Controller;

import com.hopital.GestionHopital.Entity.Admission;
import com.hopital.GestionHopital.Service.AdmissionService;
import com.hopital.GestionHopital.Service.AdmissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdmissionController {

    @Autowired
    AdmissionService admissionService;

    @RequestMapping(value = "/admissions")
    public ResponseEntity<Object> getAdmission(){
        return new ResponseEntity<>(admissionService.getAdmissions(), HttpStatus.OK);
    }
    @RequestMapping(value = "/admissions/create", method = RequestMethod.POST)
    public ResponseEntity<Object> createAdmission(@RequestBody Admission admission){
         admissionService.createAdmission(admission);
         return new ResponseEntity<>("successfully create admission", HttpStatus.OK);
    }
    
    @RequestMapping(value = "/admissions/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateAdmission(@PathVariable("id") int id , @RequestBody Admission admission){
        admissionService.updateAdmission(id, admission);
        return new ResponseEntity<>("successfully update bro", HttpStatus.OK);
    }
    @RequestMapping(value = "/admission/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteAdmission(@PathVariable("id") int id){
        admissionService.deleteAdmission(id);
        return new ResponseEntity<>("succesfully delete", HttpStatus.OK);
    }
}
