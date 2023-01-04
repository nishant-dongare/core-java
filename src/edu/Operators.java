package edu;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
//		new Unary();
//		new Arithmetic();
//		new Shift();
//		new Relational();
//		new Bitwise();
//		new Logical();
//		new Ternary();
		new Assignment();

	}
}

class Unary {
	int a = 10;
	int postIncrement = 0;
	int preIncrement = 0;

	Unary() {

		System.out.println("Post Increment : " + postIncrement);
		postIncrement = a++;
		System.out.println("Post Increment : " + postIncrement);
		System.out.println("A : " + a);

		a = 10;

		System.out.println("Pre Increment : " + preIncrement);
		preIncrement = ++a;
		System.out.println("Pre Increment : " + preIncrement);
	}
}

class Arithmetic {
	Arithmetic() {
		System.out.println("Enter value of A and B : ");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String s = sc.next();
		String str = sc.nextLine();
		sc.close();

		System.out.println("A + B: " + (a + b));
		System.out.println("A - B: " + (a - b));
		System.out.println("A * B: " + (a * b));
		System.out.println("A / B: " + (a / b));
		System.out.println("A % B: " + (a % b));

		System.out.println("String : " + s);
		System.out.println("String : " + str);
	}
}

class Shift {
	Shift() {
		int x = 10;
		System.out.println(x);
		System.out.println(x >> 1);
		System.out.println(x >> 2);
		System.out.println(x << 1);
		System.out.println(x << 2);
	}
}

class Relational {
	Relational() {
		int a = 20, b = 10;
		System.out.println("A == B : " + (a == b));
		System.out.println("A != B : " + (a != b));
		System.out.println("A >= B : " + (a >= b));
	}
}

class Bitwise {
	int x, y;

	Bitwise() {
		x = 0;
		y = 0;
		System.out.println("x & y : 0 & 0 : " + (x & y));
		System.out.println("x | y : 0 | 0 : " + (x | y));
		System.out.println("x ^ y : 0 ^ 0 : " + (x ^ y));

		x = 0;
		y = 1;
		System.out.println("x & y : 0 & 1 : " + (x & y));
		System.out.println("x | y : 0 | 1 : " + (x | y));
		System.out.println("x ^ y : 0 ^ 1 : " + (x ^ y));

		x = 1;
		y = 0;
		System.out.println("x & y : 1 & 0 : " + (x & y));
		System.out.println("x | y : 1 | 0 : " + (x | y));
		System.out.println("x ^ y : 1 ^ 0 : " + (x ^ y));

		x = 1;
		y = 1;
		System.out.println("x & y : 1 & 1 : " + (x & y));
		System.out.println("x | y : 1 | 1 : " + (x | y));
		System.out.println("x ^ y : 1 ^ 1 : " + (x ^ y));
	}
}

class Logical {
	Logical() {
		int a = 10, b = 20;

		System.out.println((a == 10 && b == 20));
		System.out.println((a == 10 && b == 10));
		System.out.println((a != 10 || b != 20));
		System.out.println((a == 10 || b == 10));
	}
}

class Ternary {
	int n = 3;
	int age = 21;

	Ternary() {
		System.out.println(n + " is " + ((n % 2 == 0) ? "Even" : "Odd"));

		int a = 100;
		int b = 40;
		int c = 30;
		// Greater between 2
		System.out.println((a > b) ? "A is Greater" : "B is Greater");
		// Greater Between 3
		int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Greater number is " + result);

		System.out.println(a >= 18 ? "Person is Eligible" : "Person isn't Eligible");
	}
}

class Assignment {
	Assignment() {
		int a = 100;
		int b = 40;
		System.out.println((a += b) + "\n" + (a += 1));
	}
}
