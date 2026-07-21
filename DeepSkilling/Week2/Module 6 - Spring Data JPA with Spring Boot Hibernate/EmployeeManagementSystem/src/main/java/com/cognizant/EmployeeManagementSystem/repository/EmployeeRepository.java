package com.cognizant.EmployeeManagementSystem.repository;
import com.cognizant.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface  EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);

    List<Employee> findByEmail(String email);


    List<Employee> findByDepartmentId(Long departmentId);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee getEmployeeByEmail(@Param("email") String email);


    // Native SQL Query
    @Query(value = "SELECT * FROM employees WHERE name = ?1", nativeQuery = true)
    List<Employee> getEmployeeByName(String name);

}
