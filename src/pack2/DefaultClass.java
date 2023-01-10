package pack2;

class DefaultParentClass {
	private int a = 11;

	void display() {
		System.out.println("Private Method : " + a);
	}
}

class DefaultSubClass extends DefaultParentClass {
	void displaySub() {
		System.out.println("Default Sub Class Variable");
	}
}

public class DefaultClass {
	public static void main(String[] args) {
		DefaultSubClass dsc = new DefaultSubClass();
		dsc.displaySub();
		dsc.display();
	}
}
