package homework4.time;

public class TestMyTime {

	public static void main(String[] args) {
		
        MyTime time = new MyTime(0, 1, 2);
        System.out.println(time);

        time.setHour(3);
        time.setMinute(4);
        time.setSecond(5);
        System.out.println(time);
        System.out.println("hour is: " + time.getHour());
        System.out.println("minute is: " + time.getMinute());
        System.out.println("second is: " + time.getSecond());

        time.setTime(23, 59, 58);
        System.out.println(time);

        System.out.println(time.nextSecond());
        System.out.println(time.nextSecond().nextSecond());

        System.out.println(time.previousSecond());
        System.out.println(time.previousSecond().previousSecond());

        System.out.println(time.nextMinute());
        System.out.println(time.nextMinute().nextMinute());

        System.out.println(time.previousMinute());
        System.out.println(time.previousMinute().previousMinute());

        System.out.println(time.nextHour());
        System.out.println(time.nextHour().nextHour());

        System.out.println(time.previousHour());
        System.out.println(time.previousHour().previousHour());
	}

}
