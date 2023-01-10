package pack2;

public class ProtectedMain {

	public static void main(String[] args) {
		ProtectedClass pc = new ProtectedClass();
		pc.displayPublic();
		pc.displayProtect(); // can access as it is protected as it is in same package

	}

}
/*
 * //***Inheritance with extends keyword ***
 * 
 * 
 * class ProtectedMain extends ProtectedClass {
 * 
 * public static void main(String[] args) { ProtectedClass pc = new
 * ProtectedClass(); pc.display(); }
 * 
 * }
 */