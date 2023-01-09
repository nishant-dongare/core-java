package edu.logics;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		LEFT PATTERNS
//		leftStarPattern(n);
//		reverseLeftStarPattern(n);
//		leftNumbersPattern(n);
//		incrementalNumPattern(n);
//		alphabeticalPattern(n);

//		RIGHT PATTERNS
		rightStarPattern(n);

	}

	private static void rightStarPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n - 1 - i; k > 0; k--) {
				System.out.print("_");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void reverseLeftStarPattern(int n) {
		// REVERSE
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void alphabeticalPattern(int n) {

		char counter = 'A';
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}

	}

	private static void incrementalNumPattern(int n) {
		int counter = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}

	}

	private static void leftNumbersPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}

	}

	private static void leftStarPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
