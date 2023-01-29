package basicprograms;

public class Blocks {

	static {
		System.out.println("Static");
	}
	{
		System.out.println("Blocks only");
	}

	Blocks() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Public Static Void Main");
		new Blocks();
	}

}
