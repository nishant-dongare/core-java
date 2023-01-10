package edu;

public class TestStatic {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.showData();

		Student s2 = new Student();
		Student.b++;
		s2.showData();
	}
}

class Student {
	int a;
	static int b;// initialized zero only

	Student() {
		b++;
	}

	public void showData() {
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}
}
