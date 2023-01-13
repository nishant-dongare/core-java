package oops.Exceptions;

class UserDefinedException extends Exception {
	private int ex;

	UserDefinedException(int a) {
		ex = a;
	}

	public String toString() {
		return "UserDefinedException [" + ex + "] is less than zero";
	}
}

public class MyException {

	static void sum(int a, int b) throws UserDefinedException {
		if (a < 0) {
			throw new UserDefinedException(a);
		} else {
			System.out.println("Sum is " + (a + b));
		}
	}

	public static void main(String[] args) {
		try {
			sum(-0, 1);
		} catch (UserDefinedException ude) {
			System.out.print(ude);
		}
	}

}
