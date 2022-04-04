package com.example.ecomrest.domains.employee.service;

import com.example.ecomrest.domains.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmploye(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeByID(long id);
    Employee updateEmployeeByID(Employee employee,long id);
    List<Employee> deleteEmployeeByID(Employee employee,long id);
}
