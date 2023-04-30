package com.prasad.demo.rest;

import com.prasad.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api") //base request mapping.
public class StudentRestController {

    //define an endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>(); //hard code for now, later use the database.
        theStudents.add(new Student("Sai prasad","Palli"));
        theStudents.add(new Student("Sai","Palli"));
        theStudents.add(new Student("Prasad","Palli"));

        return theStudents;
    }

}
