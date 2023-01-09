package oops;

public class Final extends Parent {

	// Cannot override the final method from Parent
//	void display() {
//		System.out.println("Child final Class");
//	}

	void show() {
		System.out.println("Child final Class");
	}

	public static void main(String[] args) {
		final int a = 10;
//		a=20; // final variable cannot be assigned
		Parent p = new Parent();
		p.display();
		p.show();
	}

}

//cannot Inherit if final
class Parent {
	final void display() {
		System.out.println("Parent Class : display()");
	}

	void show() {
		System.out.println("Parent Class : show()");
	}
}
