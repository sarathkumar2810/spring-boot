package com.learn.springboot.lean_spring_boot.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalProgramming {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 23, 54, 71, 87, 46);
		
		List<String> fruits = List.of("apple","banana", "Mango");
  
		printAllNumbersFunctional(numbers);
		
		printFruit(fruits);
	}

	private static void printNumber(int num) {
		System.out.println(num);
	}
	
	private static boolean isEven(int num) {
		return num % 2 == 0;
	}

	private static void printAllNumbersFunctional(List<Integer> numbers) {
		numbers.stream()
			    .filter(FunctionalProgramming::isEven) //Method Reference
				.forEach(FunctionalProgramming::printNumber); //Method Reference
//			    .filter(d -> d % 2 == 0)  //lambda Expression
//			    .forEach(System.out::println);
	}
	
	private static void printFruit(List<String> fruits) {
		Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		Optional<String> fruit = Optional.of("banana");
		System.out.println(fruit);
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
	}
}
