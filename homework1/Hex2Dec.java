package homework1;

import java.util.*;

public class Hex2Dec {

	public static void main(String[] args) {
		
		String hexCode = "0123456789ABCDEF";
		int num = 0;
		boolean tag = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Hexadecimal string: ");
		String inStr1 = sc.next();
		String inStr = inStr1.toUpperCase();
		sc.close();
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			int n = hexCode.indexOf(inChar);
			if (n == -1) {
				tag = false;
				break;
			}
			num = num * 16 + n;
		}
		if (tag) {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr1, num);
		} else {
			System.out.printf("error: invalid hexadecimal string \"%s\"", inStr1);
		}

	}

}
