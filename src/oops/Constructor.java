package oops;

public class Constructor {
	String name;
	String city;
	int rollno;
	String course;

	public Constructor() {
		System.out.println("DEFAULT CONSTRUCTOR");
		name = "Nishant";
	}

	public Constructor(String c) {
		System.out.println("PARAMETERIZED CONSTRUCTOR");
		city = c;
	}

	public Constructor(int rollno, String course) {
		System.out.println("MULTI-PARAMETERIZED CONSTRUCTOR");
		this.rollno = rollno;
		this.course = course;
	}

	public Constructor(Constructor copy) {
		System.out.println("COPY CONSTRUCTOR");
		System.out.println("Parameters : " + copy.rollno + " " + copy.course);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println("My Name is " + c.name);

		Constructor pc = new Constructor("KALYAN");
		System.out.println(pc.city);

		Constructor pc2 = new Constructor(15, "JAVA");
		System.out.println(pc2.rollno + " " + pc2.course);

		new Constructor(pc2);

	}
}
