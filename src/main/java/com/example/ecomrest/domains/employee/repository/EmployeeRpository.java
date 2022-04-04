package com.example.ecomrest.domains.employee.repository;

import com.example.ecomrest.domains.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRpository extends JpaRepository<Employee, Long> {

}
