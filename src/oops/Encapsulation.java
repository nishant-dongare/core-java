package oops;

public class Encapsulation {

	public static void main(String[] args) {
		// USING OBJECTS AND GETTER SETTER
		Student4GetSet s = new Student4GetSet(0, "", "");
		s.setRollno(15);
		s.setName("Nishant");
		s.setCity("Kalyan");

		System.out.println("Roll No : " + s.getRollno());
		System.out.println("Name : " + s.getName());
		System.out.println("City : " + s.getCity());

		// USING CONSTRUCTOR
		Student4GetSet sc = new Student4GetSet(11, "Eleven", "Thane");

		System.out.println("Roll No : " + sc.getRollno());
		System.out.println("Name : " + sc.getName());
		System.out.println("City : " + sc.getCity());
	}
}
