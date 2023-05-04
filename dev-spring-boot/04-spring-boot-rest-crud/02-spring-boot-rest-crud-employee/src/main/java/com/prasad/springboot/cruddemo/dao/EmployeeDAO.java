package com.prasad.springboot.cruddemo.dao;

import com.prasad.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll(); //return a list of employees.
}
