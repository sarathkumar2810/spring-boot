package com.learn.springboot.jpa.lean_jpa_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.jpa.lean_jpa_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);
	
	Course findByName(String course);
	
}
