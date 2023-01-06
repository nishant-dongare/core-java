package oops;

public class MethodOverload {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a) {
		return ++a;
	}

	float add(float a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(add(20, 10));

		// CALLING WITH OBJECT
		MethodOverload m = new MethodOverload();
		System.out.println(m.add(2.5f, 10));

	}

}
