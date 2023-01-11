package oops;

class Calculate {
	static int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	float div(float a, float b) {
		return a / b;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("STATIC ADDITION : " + Calculate.add(2, 3));
		Calculate c = new Calculate();
		System.out.println("SUBSTRACTION : " + c.sub(5, 4));
		System.out.println("MULTIPLY : " + c.mul(7, 9));
		System.out.println("DIVISION : " + c.div(3.3f, 2.2f));

	}

}
