package oops.Exceptions;

public class ArrayBoundException {

	public static void main(String[] args) {

		try {
			int a[] = { 1, 2, 3 };
			System.out.println(a[50]);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally");
		}
	}

}
