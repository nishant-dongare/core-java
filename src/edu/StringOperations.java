package edu;

import java.util.Arrays;

//String are Immutables
public class StringOperations {

	public static void main(String[] args) {
		String s = "Nishant";
		System.out.println(s);
		String str = new String("Dongare");
		System.out.println(str);
		// Concatenation
		System.out.println("Concat : " + s + " " + str);
		System.out.println("Concat : " + s + " ".concat(str));
		// length count
		System.out.println("Length : " + str.length());
		System.out.println("Length : " + (s + " ".concat(str)).length());
		// Substring
		System.out.println("Substring : " + s.substring(1, 3));
		// UpperCase
		System.out.println("Uppercase : " + s.toUpperCase());
		// LowerCase
		System.out.println("Lowercase : " + s.toLowerCase());
		// Null Check
		System.out.println("isBlank(\" \") : " + " ".isBlank());
		System.out.println("isEmpty(\" \") : " + " ".isEmpty());

		char[] c = new char[7];
		s.getChars(0, 7, c, 0);
		System.out.println("C : " + c);
		// getChars
		System.out.println("getChars : " + Arrays.toString(c));

		// Comparison
		System.out.println("Comparison : " + s.compareTo(str));

		// Equal
		System.out.println("Equals : " + s.equals(c));
		System.out.println("Equals : " + s.equals("Itachi"));

		// Startswith Endswith
		System.out.println("StartsWith : " + s.startsWith("N"));
		System.out.println("StartsWith : " + s.startsWith("n"));
		System.out.println("EndsWith : " + s.endsWith("t"));
		System.out.println("EndsWith : " + s.endsWith("T"));

		// Replace
		System.out.println("Replace : " + str.replace("a", "A"));

		// Repeat
		System.out.println("Repeat : " + "Nishant ".repeat(3));

		// CharAt
		System.out.println("Char At : " + s.charAt(0));

		// Trim
		System.out.println("STrim :" + " Hello ".strip());
		System.out.println("Trim Leading :" + " Hello ".stripLeading());
		System.out.println("Trim Trailing :" + " Hello ".stripTrailing());
	}

}
