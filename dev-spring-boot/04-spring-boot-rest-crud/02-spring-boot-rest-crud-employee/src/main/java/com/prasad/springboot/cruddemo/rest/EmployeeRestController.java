package com.prasad.springboot.cruddemo.rest;

import com.prasad.springboot.cruddemo.entity.Employee;
import com.prasad.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    //quick and dirty - inject EmployeeDAO directly (using constructor injection) - will refactor it later.
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    //expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
