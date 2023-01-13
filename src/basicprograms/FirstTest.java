package basicprograms;

class Subject {
	// Instance Variable
	int javaMarks;
	int pythonMarks;
	static String subName="JAVA";

	void displayMarks() {
		System.out.println(javaMarks);
		System.out.println(pythonMarks);
	}
}

public class FirstTest {
	static int a=10;

	static void displayAge(int age) {
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		System.out.println("Hello There");
		System.out.println(a);
		Subject s = new Subject();
		s.javaMarks = 99;
		s.pythonMarks = 36;

//		new FirstTest().displayAge(5);
		s.displayMarks();

		System.out.println(Subject.subName);
		System.out.println(s.javaMarks);
		System.out.println(s.pythonMarks);
	}
}
