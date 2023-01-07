package Package1;

class PrivateClass {
	private int a = 11;

	private void displayPrivate() {
		System.out.println("Private Method : " + a);
	}

	void display() {
		System.out.println("Private Method : " + a);
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		PrivateClass pc = new PrivateClass();
//		System.out.println(pc.a);		//Private variables cant be accessed
//		displayPrivate();				//Private methods cant be accessed
		pc.display();

	}

}
