package oops;

public class Inheritance {

	public static void main(String[] args) {
//		/*SINGLE INHERITANCE*/
//		SingleInheritance si = new SingleInheritance();
//		si.displaySuper();
//		si.displaySub();

		/* MULTILEVEL INHERITANCE */
//		MultilevelInheritance i = new MultilevelInheritance();
//		i.displaySuper();
//		i.displaySub();
//		i.display();

		/* HIERARCHICAL INHERITANCE */
//		CompStudent cs = new CompStudent();
//		cs.displaySuper();
//		cs.displayCompStudent();

		SingleInheritance si = new SingleInheritance();
		si.displaySuper();
		si.displaySub();
	}

}

class Student {
	int sid = 10;

	void displaySuper() {
		System.out.println("Roll No : " + sid);
	}
}

class SingleInheritance extends Student {
	String dept = "IT Department";

	void displaySub() {
		System.out.println("Department : " + dept);
	}
}

class MultilevelInheritance extends SingleInheritance {
	String dept = "MultiLevel";

	void display() {
		System.out.println("Class : " + dept);
	}
}

class CompStudent extends Student {
	String dept = "CO Department";

	void displayCompStudent() {
		System.out.println("Department : " + dept);
	}
}
