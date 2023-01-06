package edu.logics;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
//		checkPrimeNumber();
		one2FiftyPrime();
	}

	private static void one2FiftyPrime() {
		boolean isPrime = true;
		int i;
		for (int n = 2; n < 50; n++) {
			i = 2;
			while (i < n && isPrime) {
				if (n % i == 0 && n != i) {
					isPrime = false;
				}
				i++;
			}
			if (isPrime)
				System.out.println(n);
			isPrime = true;
		}
	}

	private static void checkPrimeNumber() {
		System.out.print("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		int i = 2;
		while (i < n && isPrime) {
			if (n % i == 0) {
				isPrime = false;
			}
			i++;
		}
		System.out.println(n + " is " + (isPrime ? "Prime Number" : "Not Prime Number"));
	}

}
