package oops.Exceptions;

public class NumberFormatException {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(null);
			System.out.println("A : " + a);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			int b = Integer.parseInt("Hii");
			System.out.println("B : " + b);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			int c = Integer.parseInt("90");
			System.out.println("C : " + c);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
