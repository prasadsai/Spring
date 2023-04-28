package com.prasad.cruddemo;

import com.prasad.cruddemo.dao.StudentDAO;
import com.prasad.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean   //This snippet of code will execute after the Spring beans are created
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){ //CommandLineRunner is from the Spring Boot Framework //Inject the studentDAO
		//lambda expression
		return runner->{
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display the list of students
		for(Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// Create a Student Object
		System.out.println("Creating a student ...");
		Student tempStudent = new Student("Sai", "sai", "prasadsai@gmail.com");

		// Save the student
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// Display the id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generating id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving the student with the given id: "+ theId);
		Student myStudent = studentDAO.findById(theId);

		// display student -----// can we print Student myStudent object? yes, because we have toString() method - override
		System.out.println("Found the student: "+myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("sai", "prasad", "saiprasad@gmail.com");
		Student tempStudent2 = new Student("palli", "sai", "pallisai@gmail.com");
		Student tempStudent3 = new Student("sai", "palli", "saipalli@gmail.com");

		// save the student objects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//

	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("sai prasad", "palli", "saiprasadpalli97@gmail.com");

		//save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		//display the id of the saved student
		System.out.println("Saved student. Generating id: " +tempStudent.getId());

	}

}
