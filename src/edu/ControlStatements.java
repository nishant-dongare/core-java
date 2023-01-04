package edu;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
//		//IF ELSE
//		greater();
//		grade();
//		signCheck();

//		//SWITCH STATEMENT
		arithmaticSwitch();
	}

	static void arithmaticSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two Integers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print("Enter the Operator : ");
		int o = sc.next().charAt(0);
		sc.close();
		switch (o) {
		case '+':
			System.out.println("Addition of Numbers : " + (a + b));
			break;
		case '-':
			System.out.println("Substraction of Numbers : " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication of Numbers : " + (a * b));
			break;
		case '/':
			System.out.println("Division of Numbers : " + (a / b));
			break;
		case '%':
			System.out.println("Addition of Numbers : " + (a % b));
			break;
		default:
			System.out.println("GO HOME");
		}
	}

	static void signCheck() {
		System.out.print("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		sc.close();
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println(n + " is Negative");
		} else if (n == 0) {
			System.out.println(n + " is Zero");
		} else {
			System.out.println(n + " is Postive");
		}
	}

	static void grade() {
		System.out.print("Enter the Marks : ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		sc.close();
		if (marks < 50) {
			System.out.println("You are nothing but Failure");
		} else if (marks < 60) {
			System.out.println("D Grade");
		} else if (marks < 70) {
			System.out.println("C Grade");
		} else if (marks < 80) {
			System.out.println("B Grade");
		} else if (marks < 90) {
			System.out.println("A Grade");
		} else if (marks <= 100) {
			System.out.println("A++ Grade");
		} else {
			System.out.println("You are nothing but a Failure");
		}
	}

	static void greater() {
		int a = 50, b = 40, c = 30;

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is Greater Number");
			} else {
				System.out.println(c + " is Greater Number");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is Greater Number");
			} else {
				System.out.println(c + " is Greater Number");
			}
		}

	}
}
