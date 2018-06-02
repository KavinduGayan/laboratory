package com.ech.lab.laboratory.dao;

import com.ech.lab.laboratory.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/24/2018.
 */
@org.springframework.stereotype.Repository
@Transactional
public class PatientDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Autowired
    private PatientRepository patientRepository;
    /*public long add (Patient patient) {
        entityManager.persist(patient);
        return patient.getId();
    }*/

    public Patient add (Patient patient) {
        return patientRepository.save(patient);
    }


    /*public Patient get(long id) {
        return entityManager.find(Patient.class,id);
    }*/

    public Optional<Patient> get(long id) {
        return patientRepository.findById(id);
    }

    public Patient update (Patient patient) {
        return entityManager.merge(patient);
    }


    /*public void delete (Patient patient) {
        *//*entityManager.find(Patient.class,patient.getId());
        entityManager.remove(patient);*//*
        entityManager.remove(entityManager.contains(patient) ? patient : entityManager.merge(patient));
    }*/

    public void delete (Patient patient) {
        patientRepository.delete(patient);
    }

    /*public List<Patient> get() {
        return entityManager.createQuery("SELECT p FROM Patient p").getResultList();
    }*/


    public List<Patient> get() {
        return patientRepository.findAll();
    }
}
