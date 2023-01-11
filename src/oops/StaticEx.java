package oops;

class Students {
	int rollno;
	String name;
	static String course;
}

public class StaticEx {

	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();

		Students.course = "JAVA FULLSTACK";
		s1.rollno = 1;
		s1.name = "Student 1";

		s2.rollno = 2;
		s2.name = "Student 2";

		s3.rollno = 3;
		s3.name = "Student 3";

		System.out.println("S1 Roll No : " + s1.rollno + " S1 NAME : " + s1.name + " S1 Course : " + Students.course);
		System.out.println("S2 Roll No : " + s2.rollno + " S2 NAME : " + s2.name + " S2 Course : " + Students.course);
		System.out.println("S3 Roll No : " + s3.rollno + " S3 NAME : " + s3.name + " S3 Course : " + Students.course);

		Students.course = "PYTHON";
		s2.name = "ABC";
		System.out.println("S1 Roll No : " + s1.rollno + " S1 NAME : " + s1.name + " S1 Course : " + Students.course);
		System.out.println("S2 Roll No : " + s2.rollno + " S2 NAME : " + s2.name + " S2 Course : " + Students.course);
		System.out.println("S3 Roll No : " + s3.rollno + " S3 NAME : " + s3.name + " S3 Course : " + Students.course);

	}

}
