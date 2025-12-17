package com.ghonem.employee_api.service;

import com.ghonem.employee_api.model.Employee;
import com.ghonem.employee_api.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepo;

    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> retrieveAllEmployees() {
        return employeeRepo.findAll();
    }

}
