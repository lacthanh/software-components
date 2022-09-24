package lab1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int sum = 0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		for (int number=LOWERBOUND; number<=UPPERBOUND; ++number) {
			sum += number;
		}
		average = sum/UPPERBOUND;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}
	
	public static void while_do(int LOWERBOUND, int UPPERBOUND) {
		int sum = 0;
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum += number;
			++number;
		}
		double average = sum/UPPERBOUND;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}
		
	public static void do_while(int LOWERBOUND, int UPPERBOUND) {
		int sum = 0;
		int number = LOWERBOUND;
		do {
			sum += number;
			++number;
		} while (number <= UPPERBOUND);
		double average = sum/UPPERBOUND;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}
	
	public static void useCount() {
		int sum = 0;
		int count = 0;
		for (int i=111; i<=8899; i++) {
			sum += i;
			++count;
		}
		double average = sum/count;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}
	
	public static void sumOfTheSquare() {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i*i;
		}
		System.out.println("The sum of square is " + sum);
	}
	
	public static void sumOddeven() {
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;
		for (int number = 1; number <= 100; number++) {
			if (number % 2 == 1) {
				sumOdd += number;
			} else {
				sumEven =+ number;
			}
		}
		if (sumOdd > sumEven) {
			absDiff = sumOdd - sumEven;
		} else {
			absDiff = sumEven - sumOdd;
		}
		System.out.println("The sumOdd is " + sumOdd);
		System.out.println("The sumEven is " + sumEven);
		System.out.println("The absDiff is " + absDiff);
	}

}
