package com.ech.lab.laboratory.dao;

import com.ech.lab.laboratory.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kavindu on 3/25/2018.
 */
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
