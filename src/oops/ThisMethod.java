package oops;

public class ThisMethod {
	int a, b;

	public ThisMethod(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Before Method Call " + this.a + " and " + this.b);
		square(this);
		System.out.println("After Method Call " + this.a + " and " + this.b);
	}

	private void square(ThisMethod t) {
		t.a *= a;
		t.b *= b;
	}

	public static void main(String[] args) {
		new ThisMethod(5, 6);
	}

}
