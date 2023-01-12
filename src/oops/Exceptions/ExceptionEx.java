package oops.Exceptions;

public class ExceptionEx {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} finally {
			c = 4 / 2;
			System.out.println(c);
		}
	}
}