package com.learn.springboot.jpa.lean_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.jpa.lean_jpa_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now", "in28Minutes"));
		repository.insert(new Course(2, "Learn Azure Now", "in28Minutes"));
		repository.insert(new Course(3, "Learn Devops Now", "in28Minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
	}

}
