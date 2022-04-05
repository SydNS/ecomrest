package com.example.ecomrest.domains.employee.controller;

import com.example.ecomrest.domains.employee.model.Employee;
import com.example.ecomrest.domains.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee/v1/")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

//    create endpoint
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmploye(employee), HttpStatus.CREATED);
    }

//    get all endpoint
    @GetMapping
    public List<Employee> getallEmployees(){
        return employeeService.getAllEmployee();
    }

//    get one id endpoint
    @GetMapping("{id}")
    public ResponseEntity<Employee> getallEmployees(@PathVariable("id") long employeeId){
        return new ResponseEntity<Employee>(employeeService.getEmployeeByID(employeeId),HttpStatus.OK);
    }

//    update one id endpoint
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployeeByID(@PathVariable("id") long employeeId,@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployeeByID(employee,employeeId),HttpStatus.OK);
    }

//    update one id endpoint
    @DeleteMapping("{id}")
    public List<Employee> deleteEmployeeByID(@PathVariable("id") long employeeId,@RequestBody Employee employee){
        employeeService.deleteEmployeeByID(employee,employeeId);
        return employeeService.getAllEmployee();
    }

}
