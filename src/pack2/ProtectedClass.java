package pack2;

public class ProtectedClass {
	int a = 10;

	protected void displayProtect() {
		System.out.println("Protected Method " + a);
	}

	public void displayPublic() {
		System.out.println("Public Method " + a);
	}

}

class ProtectedDemo {
	public static void main(String[] args) {
		ProtectedClass pc = new ProtectedClass();
		pc.displayProtect();
	}
}
