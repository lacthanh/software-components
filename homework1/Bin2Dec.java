package homework1;

import java.util.*;

public class Bin2Dec {

	public static void main(String[] args) {
		
		double result = 0.0;
		boolean tag = true;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Binary string: ");
		String inStr = sc.next();
		sc.close();

		for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
			char inChar = inStr.charAt(charIdx);
			if (inChar == '1') {
				result = result + Math.pow(2, inStr.length() - charIdx - 1);
			} else if (inChar == '0') {
				result = result + 0;
			} else if (inChar != 0 || inChar != 1) {
				tag = false;
				break;
			}
		}

		if (tag) {
			System.out.printf("The equivalent decimail number for binary \"%s\" is: %d", inStr, (int) result);
		} else {
			System.out.printf("error: invalid binary string \"%s\"\n", inStr);
		}

	}

}
