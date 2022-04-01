package com.example.ecomrest.repository;

import com.example.ecomrest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRpository extends JpaRepository<Employee, Long> {

}
