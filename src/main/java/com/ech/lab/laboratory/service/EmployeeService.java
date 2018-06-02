package com.ech.lab.laboratory.service;

import com.ech.lab.laboratory.entity.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/25/2018.
 */
public interface EmployeeService {

    Employee add(Employee employee);
    Optional<Employee> find(long id);
    List<Employee> findAll();
    void delete(long id);

}
