package oops;

abstract class Bike {
	abstract void speed();

	void display() {
		System.out.println("Bike");
	}
}

//Overriding abstract method is not Mandatory
//if subclass is abstract
class Motorbike extends Bike {

	@Override
	void speed() {
		System.out.println("MotorBike");
	}
}

public class Abstraction extends Bike {

	public static void main(String[] args) {
		Motorbike m = new Motorbike();
		m.speed();
		m.display();
//		Bike b = new Bike(); // Cannot instantiate the type Bike
		Bike a = new Abstraction();
		a.speed();
		a.display();
	}

	@Override
	void speed() {
		System.out.println("Abstraction");
	}

}
