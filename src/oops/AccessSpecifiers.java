package oops;

//*** Access Specifiers ***//
//PRIVATE:
//	Within Same Class
//DEFAULT:
//	Within Same Class AND Same Package
//PROTECTED:
//	Within Same Class AND Derived class
//PUBLIC:
//	Everywhere including outside the package
class Demo {
	int a;

	void display() {
		System.out.println("Value of a : " + a);
	}
}

public class AccessSpecifiers {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.a = 10;
		d.display();
	}
}