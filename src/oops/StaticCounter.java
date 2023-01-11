package oops;

public class StaticCounter {

	int a;
	static int b;

	public StaticCounter() {
		a++;
		b++;
	}

	public static void main(String[] args) {
		StaticCounter sc1 = new StaticCounter();
		StaticCounter sc2 = new StaticCounter();

		System.out.println(sc1.a);
		System.out.println(sc2.a);
		System.out.println("STATIC");
		System.out.println(StaticCounter.b);
		System.out.println(sc1.b);

	}

}
