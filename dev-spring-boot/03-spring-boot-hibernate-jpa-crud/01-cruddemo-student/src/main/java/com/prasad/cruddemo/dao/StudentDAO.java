package com.prasad.cruddemo.dao;

import com.prasad.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id); // why not int?


}
