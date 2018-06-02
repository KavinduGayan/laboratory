package com.ech.lab.laboratory.service;

import com.ech.lab.laboratory.dao.EmployeeDao;
import com.ech.lab.laboratory.entity.Address;
import com.ech.lab.laboratory.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/25/2018.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee add(Employee employee) {
        return employeeDao.add(employee);
    }

    @Override
    public Optional<Employee> find(long id) {
        return employeeDao.find(id);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        Address address = new Address();
        address.setId(1);
        address.setCountry("Sri Lanka");
        address.setHomeTown("wadduwa");
        employee.setId(1);
        employee.setMobile("0711438879");
        employee.setFirstName("Kavindu");
        employee.setLastName("Gayan");
        employee.setAddress(address);
        employees.add(employee);
        return employees;
                //return employeeDao.findAll();
    }

    @Override
    public void delete(long id) {
        employeeDao.delete(id);
    }
}
