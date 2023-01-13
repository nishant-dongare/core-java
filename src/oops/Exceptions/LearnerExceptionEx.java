package oops.Exceptions;

class Learner {
	private String fname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Learner(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

}

class LearnerNameException extends Exception {
	LearnerNameException(String s) {
		super(s);
	}
}

public class LearnerExceptionEx {

	static void checkName(String fname, String lname) throws LearnerNameException {
		if (fname.isBlank() || lname.isBlank()) {
			throw new LearnerNameException("Fields are Empty");
		} else {
			System.out.println("First Name : " + fname);
			System.out.print("Last Name : " + lname);
		}
	}

	public static void main(String[] args) {
		try {
			Learner l = new Learner("Light", "Lowlight");
			checkName(l.getFname(), l.getLname());
		} catch (LearnerNameException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
