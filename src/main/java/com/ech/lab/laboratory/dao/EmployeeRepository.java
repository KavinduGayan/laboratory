package com.ech.lab.laboratory.dao;

import com.ech.lab.laboratory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kavindu on 3/25/2018.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
