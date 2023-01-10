package oops;

public class TypeCasting {

//	>>Implicit/Widening>>
//	byte -> short -> char -> int -> long -> float -> double
//	<<Explicit/Narrowing
	public static void main(String[] args) {
		// Implicit
		int i = 10;
		long l = i;
		System.out.println("Implicit Typecasting :" + l);

		// Explicit
		float f = 20.0f;
		int n = (int) f;
		System.out.println("Explicit Typecasting :" + n);
	}

}
