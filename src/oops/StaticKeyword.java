package oops;

public class StaticKeyword {
	public static void main(String[] args) {
		StaticStudent.a = 10;
		StaticStudent.b = 20;
		StaticStudent.show();
		StaticStudent s1 = new StaticStudent();
		System.out.println("Non Static : " + s1.c);
	}
}

class StaticStudent {
	static int a;
	static int b;
	int c;

	StaticStudent() {
		c++;
	}

	static void show() {
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}
}
