package oops.Interface;

interface Exam {
	void percent();
}

class Student {
	String name;
	int rollno, marks1, marks2;

	Student(String name, int roll_no, int marks1, int marks2) {
		super();
		this.name = name;
		this.rollno = roll_no;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}

	void show() {
		System.out.println("Student Name : " + name);
		System.out.println("Roll No : " + rollno);
		System.out.println("Marks 1 : " + marks1);
		System.out.println("Marks 2 : " + marks2);

	}

}

class Result extends Student implements Exam {

	Result(String name, int roll_no, int marks1, int marks2) {
		super(name, roll_no, marks1, marks2);
	}

	float p;

	@Override
	public void percent() {
		int total = marks1 + marks2;
		p = (float) total / 2;
	}

}

public class Students {

	public static void main(String[] args) {
		Result r = new Result("Light", 1, 70, 70);
		r.percent();
		r.show();
		System.out.println("Percentage : " + r.p);
	}

}
