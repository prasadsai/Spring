package com.prasad.cruddemo.dao;

import com.prasad.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository // gives us Support for Component-scanning, also handle the spring support for exception translation.
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //constructor to inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional // as we are updating the database
    public void save(Student theStudent) {
        entityManager.persist(theStudent); // saves the student into the database.
    }

    @Override
    public Student findById(Integer id) { // why not int and why Integer?
        return entityManager.find(Student.class, id);
    }
}








