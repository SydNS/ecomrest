package com.example.ecomrest.domains.employee.service.Impl;

import com.example.ecomrest.domains.employee.exception.ResourceNotFoundException;
import com.example.ecomrest.domains.employee.model.Employee;
import com.example.ecomrest.domains.employee.repository.EmployeeRpository;
import com.example.ecomrest.domains.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRpository employeeRpository;

    public EmployeeServiceImpl(EmployeeRpository employeeRpository) {
        super();
        this.employeeRpository=employeeRpository;
    }

    @Override
    public Employee saveEmploye(Employee employee) {
        return employeeRpository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRpository.findAll();
    }

    @Override
    public Employee getEmployeeByID(long id) {
        Optional<Employee>  employee=employeeRpository.findById(id);
        if (employee.isEmpty()) throw new ResourceNotFoundException("Employee", "ID", id);
        else return employee.get();
    }

    @Override
    public Employee updateEmployeeByID(Employee employee,long id) {
        Employee oldEmployee= employeeRpository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Employee","Id",id)
        );
        oldEmployee.setFirstname(employee.getFirstname());
        oldEmployee.setLastname(employee.getLastname());
        oldEmployee.setEmail(employee.getEmail());

        employeeRpository.save((oldEmployee));
        return oldEmployee;
    }
    @Override
    public List<Employee> deleteEmployeeByID(Employee employee,long id) {
        Employee employeeToDelete= employeeRpository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Employee","Id",id)
        );

        employeeRpository.delete((employeeToDelete));
        return employeeRpository.findAll();
    }
}
