package lab1;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 3;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int fn = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		System.out.println("The first " + nMax + " Fibonacci numbers are:");
		System.out.print(fnMinus1 + ", " + fnMinus2);
		while (n <= nMax) {
			++n;
			fnMinus1 = fnMinus2;
			fnMinus2 = fn;
			fn = fnMinus1 + fnMinus2;
			sum += fn;
			System.out.print(", " + fn);
		}
		average = sum/nMax;
		System.out.printf("\n%s", "The average is " + average);
		Tribonacci();
	}
	
	public static void Tribonacci() {
		int t1 = 1;
		int t2 = 1;
		int t3 = 2;
		int tn = 1;
		int n = 20;
		System.out.printf("\n%s", "The first " + n + " Tribonacci numbers are:");
		System.out.print(t1 + ", " + t2 + ", " + t3);
		for (int i=4; i<=20; i++) {
			t1 = t2;
			t2 = t3;
			t3 = tn;
			tn = t1 + t2 + t3;
			System.out.print(", " + tn);
		}
	}

}
