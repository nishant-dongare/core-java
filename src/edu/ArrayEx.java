package edu;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int b[];
		b = a.clone();

		for (int i : b)
			System.out.println(i);
	}

}
