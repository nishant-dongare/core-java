package oops;

import java.util.Scanner;

public class InheritanceEx {

	public static void main(String[] args) {

//		Substraction s = new Substraction();
//		s.add();
//		s.sub();
//		System.out.println("Enter two numbers : ");
//		s.add(100, 200);

		Divide d = new Divide();
		d.getValues();
		d.add();
		d.sub();
		d.multi();
		d.div();

//		Model m = new Model();
//		m.car("SUV");
//		m.brand("TATA");
//		m.model("EV");
	}

}

class Addition {
	int a, b;

	void getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	}

	void add() {
		System.out.println("Sum : " + (a + b));
	}

//	void add(int a, int b) {
//		System.out.println("Sum : " + (a + b));
//	}
}

class Substraction extends Addition {
	void sub() {
		System.out.println("Sum : " + (a - b));
	}

}

class Multiplication extends Substraction {
	void multi() {
		System.out.println("Multiplication : " + (a * b));
	}
}

class Divide extends Multiplication {
	void div() {
		System.out.println("Divide : " + (a / b));
	}
}

class Car {
	void car(String car) {
		System.out.println(car);
	}
}

class Brand extends Car {
	void brand(String brand) {
		System.out.println(brand);
	}
}

class Model extends Brand {
	void model(String model) {
		System.out.println(model);
	}
}
