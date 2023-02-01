package oops.Interface;

interface A {
	static int a = 10;

	default void print() {
		System.out.println("Interface Method");
	}

	static void show() {
		System.out.println("Static Interface Method");
	}
}

public class InterfaceEx implements A {

//	public void print() {
//		System.out.println("Class Method");
//	}

	public static void main(String[] args) {
		InterfaceEx i = new InterfaceEx();
		i.print();
//		show(); not reachable
		A.show();
		System.out.println(a);
	}

}
