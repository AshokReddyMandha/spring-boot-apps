package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Student;
import com.ashokit.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		
		Student s1 = new Student();
		s1.setStdId(101);
		s1.setStdName("SOne");
		s1.setStdCourse("Java");
		
		
		Student s2 = new Student();
		s2.setStdId(102);
		s2.setStdName("fsd");
		s2.setStdCourse("Java");
		
		
		Student s3 = new Student();
		s3.setStdId(103);
		s3.setStdName("Student3");
		s3.setStdCourse("oracle10g");
		
		List<Student> saveAll = studentRepo.saveAll(Arrays.asList(s1,s2,s3));
		
		System.out.println("inserted....");
	}

}
