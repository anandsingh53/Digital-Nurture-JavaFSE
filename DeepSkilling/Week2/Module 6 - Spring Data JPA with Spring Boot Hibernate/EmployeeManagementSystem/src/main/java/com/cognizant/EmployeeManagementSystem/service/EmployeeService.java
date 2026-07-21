package com.cognizant.EmployeeManagementSystem.service;

import com.cognizant.EmployeeManagementSystem.entity.Employee;
import com.cognizant.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Create
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Read All
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Read By Id
    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    // Update
    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Delete
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
    public Employee getEmployeeByEmail(String email) {
        return repository.getEmployeeByEmail(email);
    }
}