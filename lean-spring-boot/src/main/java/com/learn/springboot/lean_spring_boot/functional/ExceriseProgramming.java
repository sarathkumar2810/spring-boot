package com.learn.springboot.lean_spring_boot.functional;

import java.util.List;

public class ExceriseProgramming {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 23, 54, 71, 87, 46);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes");
 
		printOddNumbers(numbers);

		printAllCourses(courses);

		printCourse(courses);

		printLettersCount(courses);

		printSquareNumbers(numbers);
		
		printQubeNumbers(numbers);
		
		printCourseLength(courses);
	}

	private static void printOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(d -> d % 2 != 0).forEach(System.out::println);
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}

	private static void printCourse(List<String> courses) {
		courses.stream().filter(d -> d.contains("Spring")).forEach(System.out::println);
	}

	private static void printLettersCount(List<String> courses) {
		courses.stream().filter(d -> d.length() >= 4).forEach(System.out::println);
	}

	private static void printSquareNumbers(List<Integer> numbers) {
		numbers.stream().filter(d -> d % 2 == 0).map(num -> num * num).forEach(System.out::println);
	}
	
	private static void printQubeNumbers(List<Integer> numbers) {
		numbers.stream().filter(d -> d % 2 == 0).map(num -> num * num * num).forEach(System.out::println);
	}
	
	private static void printCourseLength(List<String> courses) {
		courses.stream().forEach(d -> System.out.println(d + " " + d.length()));
	}

}
