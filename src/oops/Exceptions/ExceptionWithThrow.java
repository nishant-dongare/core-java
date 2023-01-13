package oops.Exceptions;

class MinimumAccountBalance extends Exception {
	String message;

	public MinimumAccountBalance(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MinimumAccountBalance Exception : " + message;
	}

}

public class ExceptionWithThrow {

	static void age(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible");
		} else {
			System.out.println("Welcome");
		}
	}

	static void checkBalance(int balance) throws MinimumAccountBalance {
		try {
			if (balance < 1000) {
				throw new MinimumAccountBalance(Integer.toString(balance));
			} else {
				System.out.println("You Can Withdraw Cash");
			}
		} catch (MinimumAccountBalance e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws MinimumAccountBalance {
		age(18);
		checkBalance(9000);

	}

}
