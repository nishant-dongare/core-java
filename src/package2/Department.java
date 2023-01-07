package package2;

import package1.Employee;

////ONLY PUBLIC CAN BE ACCESSED OUTSIDE PACKAGE

public class Department {

	public static void main(String[] args) {
		Employee e = new Employee(11, "Eleven");
		e.displayPublic();
//		e.displayProtect();//NOT ACCESSBLE DUE TO PROTECTED
	}

}

//public class Department extends Employee {
//
//	public static void main(String[] args) {
//		Employee e = new Employee(11, "Eleven");
//		e.displayPublic();
////		e.displayProtect();//NOT ACCESSBLE DUE TO PROTECTED
//	}
//
//}