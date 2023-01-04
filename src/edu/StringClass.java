package edu;

//* are Mutable
//String Builder AND String Buffer
public class StringClass {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Nishant");

		System.out.println("\nString Builder");
		// Append
		System.out.println("Append : " + s.append(" Dongare"));

		// Insert
		System.out.println("Insert : " + s.insert(0, "1."));

		// Replace
		System.out.println("Replace : " + s.replace(0, 3, ""));

		// Reverse
		System.out.println("Reverse : " + s.reverse());

		// StringBuffer
		System.out.println("\nString Buffer");
		StringBuffer str = new StringBuffer("Dongare");
		StringBuffer strc = new StringBuffer();
		System.out.println("Default Capacity : " + strc.capacity());
		System.out.println("Capacity After Declaration : " + str.capacity());

		// Append
		System.out.println("Append : " + str.append(" Dongare"));

		// Insert
		System.out.println("Insert : " + str.insert(0, "1."));

		// Replace
		System.out.println(str.replace(0, 3, ""));

		// Reverse
		System.out.println("Reverse : " + str.reverse());
	}

}
