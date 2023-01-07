package package1;

class PrivateDemo {
	private int a = 11;

	private void displayPrivate() {
		System.out.println("Private Method : " + a);
	}

	void display() {
		System.out.println("Private Method : " + a);
	}
}

class PrivateClass {

	public static void main(String[] args) {
		PrivateDemo pd = new PrivateDemo();
//		System.out.println(pc.a);		//Private variables cant be accessed
//		displayPrivate();				//Private methods cant be accessed
		pd.display();

	}

}
