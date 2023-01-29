package oops;

public class ThisObject {

	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String args[]) {
		ThisObject obj = new ThisObject();
		System.out.println(obj);// prints the reference ID
		obj.m();
	}

}
