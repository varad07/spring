package com.varad.springJdbcEx;

import com.varad.springJdbcEx.Model.Student;
import com.varad.springJdbcEx.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringJdbcExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollno(104);
		s1.setName("Reva");
		s1.setMarks(100);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);

		List<Student> students= service.getStudents();
			System.out.println(students);
		}


	}


