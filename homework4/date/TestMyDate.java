package homework4.date;

public class TestMyDate {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2020, 2, 28);
		System.out.println(date1);
		System.out.println(date1.nextDay());
		System.out.println(date1.nextDay().nextDay());
		System.out.println(date1.previousDay());
		System.out.println(date1.nextMonth());
		System.out.println(date1.nextMonth().nextMonth());
		System.out.println(date1.previousMonth());
		System.out.println();

		date1.setDate(2020, 2, 29);
		System.out.println(date1);
		System.out.println(date1.nextYear());
		System.out.println(date1.previousYear());
		System.out.println();

		MyDate date2 = new MyDate(2020, 12, 30);
		System.out.println(date2);
		System.out.println(date2.nextDay());
		System.out.println(date2.nextDay());
		System.out.println(date2.previousDay());
		System.out.println(date2.nextMonth());
		System.out.println(date2.nextMonth().nextMonth());
		System.out.println(date2.previousMonth());
		System.out.println(date2.nextYear());
		System.out.println(date2.previousYear());
	}

}
