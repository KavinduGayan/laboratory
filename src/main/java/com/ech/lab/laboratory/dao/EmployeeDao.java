package com.ech.lab.laboratory.dao;

import com.ech.lab.laboratory.entity.Employee;
import com.ech.lab.laboratory.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/25/2018.
 */
@org.springframework.stereotype.Repository
@Transactional
public class EmployeeDao {
    @Autowired
    private EmployeeRepository repository;

    public Employee add (Employee employee) {
        return repository.save(employee);
    }

    public void delete (long id) {
        Optional<Employee> employee = repository.findById(id);
        if (employee.isPresent()) {
            repository.delete(employee.get());
        }
    }

    public Optional<Employee> find (long id) {
        return repository.findById(id);
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }


}
