package edu;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
//		forLoop();
//		whileLoop();
//		doWhileLoop();
//		doWhileinfinite();
//		whileinfinite();
//		sumOfAllDigits();
//		reverse();
//		stringReverse();
//		fibonacci();
//		factorial();
//		perfectSquare();
//		swapWithoutTemp();
		perfectSquare();
	}

	private static void swapWithoutTemp() {
		int a = 10, b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

	private static void perfectSquare() {
		int sqr = 4;
		int num = 0, n = sqr;
		int i = 2;
		while (num != 1) {
			if (n % i == 0) {
				n = sqr / i;
				num += n;
				i++;
			}

		}
		System.out.println(num);

	}

	private static void factorial() {
		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("FOR : " + fact);

		// While loop
		int i = 1;
		fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println("WHILE : " + fact);
	}

	private static void fibonacci() {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.println(n1 + "\n" + n2);
		for (int i = 0; i < 5; i++) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}
	}

	private static void stringReverse() {
		String s = "Nishant";
		String str = "";
		int len = s.length() - 1;
		char c;
		while (len != 0) {
			c = s.charAt(len);
			str = str + c;
			len--;
		}
		System.out.println(str);

		// using toCharArray
		String asd = "Hello";
		char[] charArray = asd.toCharArray();
		String rev = "";
		System.out.println(charArray);
		int length = charArray.length - 1;
		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		System.out.println(rev);
	}

	private static void reverse() {
		int rev = 0, rem;
		int num = 789;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);

	}

	private static void sumOfAllDigits() {
		int sum = 0, rem;
		int num = 46;
		while (num != 0) {
			rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		System.out.println(sum);

	}

	private static void whileInfinite() {

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
		sc.close();

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

	private static void doWhileInfinite() {
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
