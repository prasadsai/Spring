package com.prasad.demo.rest;

import com.prasad.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api") //base request mapping.
public class StudentRestController {

    private List<Student> theStudents;

    //define @PostConstruct to load the student data ... only once.

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>(); //hard code for now, later use the database.

        theStudents.add(new Student("Sai prasad","Palli"));
        theStudents.add(new Student("Sai","Palli"));
        theStudents.add(new Student("Prasad","Palli"));
    }

    //define an endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){


        return theStudents;
    }

    //define endpoint or "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){ //by default pathVariable studentId needs to match with the getMapping studentId
        //indexing into the list ... keep it simple for now
        return theStudents.get(studentId);
    }

}
