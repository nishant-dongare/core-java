package oops;

public class ReturnTypes {

	public static void main(String[] args) {
		System.out.println(add(20, 10));
		sub(20, 10);
		System.out.println(add(2.2f, 1.1f));
		;

	}

	private static void sub(int a, int b) {
		System.out.println("Sub " + (a + b));
	}

	static int add(int a, int b) {
		return a + b;
	}

	static float add(float a, float b) {
		return a + b;
	}
}
