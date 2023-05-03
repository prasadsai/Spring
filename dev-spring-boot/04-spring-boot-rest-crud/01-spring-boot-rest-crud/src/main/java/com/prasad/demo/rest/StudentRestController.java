package com.prasad.demo.rest;

import com.prasad.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        //check the student id again list size
        if((studentId>=theStudents.size()) || (studentId<0)){
            throw new StudentNotFoundException("Student id not found - "+studentId);
        }


        return theStudents.get(studentId);
    }

    //Add an exception handler using @ExceptionHandler annotation
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){ //what is ResponseEntity?
        //create a studentErrorResponse

        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
