package oops;

public class ThisKeyword {

	String name;

	ThisKeyword(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword("Light");
		System.out.println("Name : " + tk.name);
	}

}
