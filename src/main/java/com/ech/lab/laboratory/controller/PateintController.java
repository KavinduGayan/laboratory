package com.ech.lab.laboratory.controller;

import com.ech.lab.laboratory.entity.Patient;
import com.ech.lab.laboratory.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/24/2018.
 */
@RequestMapping("/patient")
@RestController
public class PateintController {

    @Autowired
    private PatientServiceImpl patientService;

    @PostMapping("/add")
    public void add(@RequestBody Patient patient) {
        patientService.add(patient);
    }

    @GetMapping("/get/{id}")
    public Optional<Patient> add(@PathVariable long id) {
        return patientService.get(id);
    }

    @PutMapping("/update")
    public Patient update(@RequestBody Patient patient) {
        return patientService.update(patient);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Patient patient) {
        patientService.delete(patient);
    }

    @GetMapping("/get")
    public List<Patient> get() {
        return patientService.get();
    }

}
