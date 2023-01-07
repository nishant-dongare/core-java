package oops;

class Demo {
	int a;

	void display() {
		System.out.println("Value of a : " + a);
	}
}

public class AccessSpecifiers {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.a = 10;
		d.display();
	}
}