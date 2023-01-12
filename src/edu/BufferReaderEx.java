package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Name : ");
		String name = br.readLine();
		System.out.println("Name : " + name);

		System.out.print("Enter the numbers : ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("A + B: " + (a + b));
		System.out.println("A - B: " + (a - b));
		System.out.println("A * B: " + (a * b));
		System.out.println("A / B: " + (a / b));
		System.out.println("A % B: " + (a % b));

	}

}
