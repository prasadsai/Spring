package com.prasad.cruddemo.dao;

import com.prasad.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id); // why Integer? why not int?

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    int updateAll();




}
