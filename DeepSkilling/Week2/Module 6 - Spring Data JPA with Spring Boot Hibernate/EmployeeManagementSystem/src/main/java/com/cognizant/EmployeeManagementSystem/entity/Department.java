package com.cognizant.EmployeeManagementSystem.entity;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}