package com.prasad.springboot.cruddemo.service;

import com.prasad.springboot.cruddemo.dao.EmployeeDAO;
import com.prasad.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    //define employeeDao filed
    private EmployeeDAO employeeDAO;
    //inject Employee DAO using constructor injection
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO=employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}