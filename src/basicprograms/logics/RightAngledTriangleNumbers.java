package basicprograms.logics;

import java.util.Scanner;

public class RightAngledTriangleNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0 && n < 10) {
			for (int i = 1; i <= n; i++) {
				for (int k = 1; k <= i; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}
	}
}
