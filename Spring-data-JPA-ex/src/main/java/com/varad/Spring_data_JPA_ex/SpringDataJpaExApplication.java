package com.varad.Spring_data_JPA_ex;

import com.varad.Spring_data_JPA_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringDataJpaExApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollno(101);
//		s1.setName("varad");
//		s1.setMarks(100);
//
//		s2.setRollno(102);
//		s2.setName("reva");
//		s2.setMarks(100);
//
		s3.setRollno(103);
		s3.setName("anuja");
		s3.setMarks(90);
		repo.delete(s3);
//		repo.save(s3); --save method used for both update and delete it checks if data is present if not it insert else it update
//		repo.save(s2);
//		repo.save(s3);

//		Optional<Student> s=repo.findById(103);
//		System.out.println(s.orElse(new Student()));
//		System.out.println(repo.findById(103));
//		System.out.println(repo.findByName("varad"));
//		System.out.println(repo.findByMarks(100));
//		System.out.println(repo.findByMarksGreaterThan(90));

	}

}
