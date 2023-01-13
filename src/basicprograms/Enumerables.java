package basicprograms;

public class Enumerables {

	public static void main(String[] args) {
		enum day {
			SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
		;
		System.out.println(day.MONDAY);
	}

	enum days {
		SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

		private int value;

		days(int value) {
			this.value = value;
		}
	};

//	for(
//	days i:days)
//	{
//		System.out.println(i + " : " + i.values());
//	}
}