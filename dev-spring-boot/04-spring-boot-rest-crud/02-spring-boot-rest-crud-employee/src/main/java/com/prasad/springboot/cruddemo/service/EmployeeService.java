package com.prasad.springboot.cruddemo.service;

import com.prasad.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
