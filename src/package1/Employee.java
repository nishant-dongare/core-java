package package1;

public class Employee {
	int empid;
	String empname;

	public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	protected void displayProtect() {
		System.out.println("Protected Method");
		System.out.println("Employee Id : " + empid);
		System.out.println("Employee Name : " + empname);
	}

	public void displayPublic() {
		System.out.println("Public Method");
		System.out.println("Employee Id : " + empid);
		System.out.println("Employee Name : " + empname);
	}
}
