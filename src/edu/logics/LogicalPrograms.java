package edu.logics;

public class LogicalPrograms {

	public static void main(String[] args) {
		sumOfAllDigits();
		reverse();
		stringReverse();
		fibonacci();
		factorial();
		perfectSquare();
		swapWithoutTemp();
		perfectSquare();

	}

	private static void swapWithoutTemp() {
		int a = 10, b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

	private static void perfectSquare() {
		int sqr = 4;
		int num = 0, n = sqr;
		int i = 2;
		while (num != 1) {
			if (n % i == 0) {
				n = sqr / i;
				num += n;
				i++;
			}

		}
		System.out.println(num);

	}

	private static void factorial() {
		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("FOR : " + fact);

		// While loop
		int i = 1;
		fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println("WHILE : " + fact);
	}

	private static void fibonacci() {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.println(n1 + "\n" + n2);
		for (int i = 0; i < 5; i++) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}
	}

	private static void stringReverse() {
		String s = "Nayan";
		String str = "";
		int len = s.length() - 1;
		char c;
		while (len > 0) {
			c = s.charAt(len);
			str = str + c;
			len--;
		}
		System.out.println(str);

		// using toCharArray
		String asd = "Hello";
		char[] charArray = asd.toCharArray();
		String rev = "";
		System.out.println(charArray);
		int length = charArray.length - 1;
		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		System.out.println(rev);
	}

	private static void reverse() {
		int rev = 0, rem;
		int num = 789;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);

	}

	private static void sumOfAllDigits() {
		int sum = 0, rem;
		int num = 46;
		while (num != 0) {
			rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		System.out.println(sum);

	}

}
