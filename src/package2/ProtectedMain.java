package package2;

////ONLY PUBLIC CAN BE ACCESSED OUTSIDE PACKAGE
import package1.ProtectedClass;

//PROTECTED METHOD CANNOT ACCESS OUTSIDE PACKAGE
//public class ProtectedMain {
//
//	public static void main(String[] args) {
//		ProtectedClass pc = new ProtectedClass();
//		pc.displayPublic();
//		pc.displayProtect(); // cannot access as it is protected in Package1
//
//	}
//
//}

/*Inheritance with extends keyword */
class ProtectedMain extends ProtectedClass {

	public static void main(String[] args) {
		ProtectedClass pc = new ProtectedClass();
		pc.displayPublic();
//		pc.displayProtect(); // cannot access as it is protected in Package1
	}

}
