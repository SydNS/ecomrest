package com.example.ecomrest.service.Impl;

import com.example.ecomrest.model.Employee;
import com.example.ecomrest.repository.EmployeeRpository;
import com.example.ecomrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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
}
