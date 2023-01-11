package oops;

public class ConstructorOverloading {

	int a, b;

	ConstructorOverloading(int a, int b) {
		this.a = a;
		this.b = b;
	}

	ConstructorOverloading(int a) {
		this(a, a);
	}

	ConstructorOverloading() {
		this(0);
	}

	@Override
	public String toString() {
		return "ConstructorOverloading [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(1);
		ConstructorOverloading co2 = new ConstructorOverloading(11, 22);
		System.out.println(co);
		System.out.println(co1);
		System.out.println(co2);
	}

}
