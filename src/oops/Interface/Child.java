package oops.Interface;

public class Child implements InterfaceC {

	public void displayA() {
		System.out.println("displayA");

	}

	@Override
	public void displayB() {
		System.out.println("displayB");

	}

	@Override
	public void displayC() {
		System.out.println("displayC");
	}

}
