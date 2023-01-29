package basicprograms.logics;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		pyramid(a);
		pyramid(b);
		pyramid(c);
		sc.close();

	}

	static void pyramid(int n) {
		if (n > 0 && n < 10) {
			for (int i = 1; i <= n; i++) {
				for (int j = n - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k < i; k++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
	}

}
