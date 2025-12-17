package com.ghonem.employee_api.repository;

import com.ghonem.employee_api.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


@Repository
public class EmployeeRepository {

    private Map<Long, Employee> employeeMap = new HashMap<>();
    private Long idSequence = 1L;

    public Employee save(Employee employee) {
            employee.setId(idSequence++);
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employeeMap.values());
    }

}