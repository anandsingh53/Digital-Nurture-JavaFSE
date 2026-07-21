package com.cognizant.EmployeeManagementSystem.repository;
import com.cognizant.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    List<Department> findByName(String name);
}
