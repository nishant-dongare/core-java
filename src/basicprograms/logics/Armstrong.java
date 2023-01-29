package basicprograms.logics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, n = num, rem, count = 0;
		sc.close();
//		while (n > 0) {
//			n /= 10;
//			count++;
//		}
		count = (int) (Math.log10(n) + 1);
		System.out.println(count);
		n = num;
		while (n != 0) {
			rem = n % 10;
			sum += Math.pow(rem, count);
			n = n / 10;
		}
		if (num == sum)
			System.out.println("Y");
		else
			System.out.println("N");

	}

}
