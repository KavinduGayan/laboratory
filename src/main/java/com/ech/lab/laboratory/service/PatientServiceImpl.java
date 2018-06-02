package com.ech.lab.laboratory.service;

import com.ech.lab.laboratory.entity.Patient;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/24/2018.
 */
public interface PatientServiceImpl {

    void add(Patient patient);
    Optional<Patient> get(long id);
    Patient update(Patient patient);
    void delete(Patient patient);
    List<Patient> get();
}
