package oops;

class Bird {
	String birdname;

	void display() {
		System.out.println("Bird Class = Parent Class");
	}
}

class FlyingBirds extends Bird {
	int speed;

	@Override
	void display() {
		System.out.println("FlyingBirds Class = Child Class");
	}

	void speed() {
		System.out.println("Flying Speed");
	}
}

public class Casting {

	public static void main(String[] args) {
		// Upcasting,Implicit,Child2Parent
		Bird b = new FlyingBirds();
		b.birdname = "OWL";
		System.out.println("Bird Name : " + b.birdname);
		b.display();

		// Downcasting, Explicit,Parent2Child
		FlyingBirds fb = (FlyingBirds) b;
		fb.speed = 200;
		System.out.println("Bird Name : " + fb.birdname);
		System.out.println("Bird Speed : " + fb.speed);

	}

}
