package com.prasad.springboot.cruddemo.dao;

import com.prasad.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    //define filed for EntityManager
    private EntityManager entityManager;

    //Setup Constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager){ // the parameter, entity manager is automatically created by spring boot and we can simply inject it into our application
        this.entityManager=entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        //execute query and get results
        List<Employee> employees = theQuery.getResultList();

        //return the results
        return employees;
    }
}
