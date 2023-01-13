package oops.Exceptions;

import java.util.Scanner;

class MarkException extends Exception {
	MarkException(String s) {
		super(s);
	}
}

public class StudentMarkException {

	static void checkMarks(int marks) throws MarkException {
		if (marks < 100 && marks >= 0) {
			System.out.println("Marks are Valid");
		} else {
			throw new MarkException("Invalid Marks");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Your Marks ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		sc.close();
		try {
			checkMarks(marks);
		} catch (MarkException e) {
			System.out.println(e);
		}
	}

}
