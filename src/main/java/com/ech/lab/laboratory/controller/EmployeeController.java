package com.ech.lab.laboratory.controller;

import com.ech.lab.laboratory.entity.Employee;
import com.ech.lab.laboratory.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kavindu on 3/25/2018.
 */
@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable("id") long id) {
        employeeService.delete(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Employee> find(@PathVariable("id") long id) {
        return employeeService.find(id);
    }

    @GetMapping("/find")
    public List<Employee> findAll () {
        return employeeService.findAll();
    }
}
