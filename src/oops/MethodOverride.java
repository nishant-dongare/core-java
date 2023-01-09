package oops;

public class MethodOverride {

	public static void main(String[] args) {
		Dept d = new Dept();
		d.display();

	}

}

class Emp {
	String empName = "Nishant";
	int eid;

	Emp(int eid) {
		this.eid = eid;
	}

	void display() {
		System.out.println("Employee");
		System.out.println("Employee ID : " + eid);
	}
}

class Dept extends Emp {
	Dept() {
		super(15);
		super.display();
	}

	String empName = "Manish";

	void display() {
		System.out.println("Department");
		System.out.println("Dept.empName : " + empName);
		System.out.println("Emp.empName : " + super.empName);
	}
}