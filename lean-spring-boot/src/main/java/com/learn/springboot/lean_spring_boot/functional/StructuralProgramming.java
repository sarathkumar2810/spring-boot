package com.learn.springboot.lean_spring_boot.functional;

import java.util.List;

public class StructuralProgramming {

	public static void main(String[] args) {

		printAllNumbers(List.of(12, 23, 54, 71, 87, 46));

	}

	private static void printAllNumbers(List<Integer> numbers) {
		// How to loop in numbers in Structural Approach
		for (int num : numbers) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

}
