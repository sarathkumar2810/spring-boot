package com.learn.springboot.lean_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28Minutes"), 
				new Course(2, "Learn Devops", "in28Minutes"),
				new Course(3, "Learn Python", "in28Minutes")
				);
	}

}
