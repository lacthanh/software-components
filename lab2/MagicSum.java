package lab2;

import java.util.*;

public class MagicSum {

	public static void main(String[] args) {
		
		final int SENTINEL = -1;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter a positive integer (or 1 to end): ");
			int num = sc.nextInt();
			if (num == SENTINEL) {
				break;
			}
			if (hasEight(num)) {
				sum += num;
			}
		}
		sc.close();
		System.out.println("The magic sum is: " + sum);
	}
	
	public static boolean hasEight(int num) {
		String inStr = String.valueOf(num);
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			if (inChar != '8') {
				return false;
			}
		}
		return true;
	}

}
