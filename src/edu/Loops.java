package edu;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
//		forLoop();
//		whileLoop();
//		doWhileLoop();
//		doWhileinfinite();
		whileinfinite();
	}

	private static void whileinfinite() {
		int a = 10, b = 20;
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		while (loop) {
			System.out.print("Enter the Operator or Press 0 to exit : ");
			char o = sc.next().charAt(0);
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
				loop = false;
			}
		}

	}

	private static void doWhileLoop() {
		int i = 1;
		System.out.println("Do While Loop");
		do {
			System.out.println(i);
			i++;
		} while (i < 6);
	}

	private static void whileLoop() {
		int i = 0;
		System.out.println("While Loop");
		while (i < 5) {
			System.out.println(i);
			i++;
		}

	}

	private static void forLoop() {
		System.out.println("For Loop");
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}

	private static void doWhileinfinite() {
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter two Integers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.print("Enter the Operator or any other key to exit : ");
			int o = sc.next().charAt(0);

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
				loop = false;
			}
		} while (loop);
		sc.close();
	}

}
