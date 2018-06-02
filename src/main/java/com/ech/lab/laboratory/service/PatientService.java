package com.ech.lab.laboratory.service;

import com.ech.lab.laboratory.dao.PatientDao;
import com.ech.lab.laboratory.entity.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Created by Kavindu on 3/24/2018.
 */
@Service
public class PatientService implements PatientServiceImpl{
    private static final Logger log = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientDao patientDao;
    @Override
    public void add(Patient patient) {
        patientDao.add(patient);

    }

    @Override
    public Optional<Patient> get(long id) {
        return patientDao.get(id);
    }

    @Override
    public Patient update(Patient patient) {
        return patientDao.update(patient);
    }

    @Override
    public void delete(Patient patient) {
         patientDao.delete(patient);
    }

    @Override
    public List<Patient> get() {
        return patientDao.get();
    }
}
