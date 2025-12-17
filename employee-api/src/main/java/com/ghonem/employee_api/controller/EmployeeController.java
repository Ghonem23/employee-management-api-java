package com.ghonem.employee_api.controller;

import com.ghonem.employee_api.model.Employee;
import com.ghonem.employee_api.service.EmployeeService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.retrieveAllEmployees();
    }
}