package oops;

public class Student4GetSet {
	private int rollno;
	private String name;
	private String city;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student4GetSet(int rollno, String name, String city) {
//		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

}
