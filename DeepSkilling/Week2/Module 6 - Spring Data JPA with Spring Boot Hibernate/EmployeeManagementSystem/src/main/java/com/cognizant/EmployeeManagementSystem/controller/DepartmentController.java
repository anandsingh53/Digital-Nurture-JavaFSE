package com.cognizant.EmployeeManagementSystem.controller;

import com.cognizant.EmployeeManagementSystem.entity.Department;
import com.cognizant.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id) {
        return service.getDepartmentById(id);
    }

    @PutMapping
    public Department updateDepartment(@RequestBody Department department) {
        return service.updateDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        service.deleteDepartment(id);
    }
}