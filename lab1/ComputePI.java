package lab1;

public class ComputePI {

	public static void main(String[] args) {
		double sum = 0.0;
		int MAX_DENOMINATOR = 1000;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator+=2) {
			if (denominator % 4 == 1) {
				sum += 1/denominator;
			} else if (denominator % 4 == 3) {
				sum -= 1/denominator;
			} else {
				System.out.println("Impossible!!!");
			}
		}
        System.out.println("The PI is " + sum);
	}
	
	public static void useTerm() {
		int MAX_TERM = 10000;
		double sum = 0;
		for (int term = 1; term <= MAX_TERM; term++) {
			if (term % 2 == 1) {
				sum += 1/(term*2 - 1);
			} else {
				sum -= 1/(term*2 - 1);
			}
		}
		System.out.println("The PI is " + sum);
	}

}
