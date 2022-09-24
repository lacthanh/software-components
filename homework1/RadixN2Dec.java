package homework1;

import java.util.*;

public class RadixN2Dec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radix: ");
		byte radix = sc.nextByte();
		System.out.print("Enter the string: ");
		String inStr = sc.next();
		sc.close();
		
		if (radix == 2) {
			Bin2Dec(inStr);
		} else if (radix == 8) {
			Oct2Dec(inStr);
		} else if (radix == 16) {
			Hex2Dex(inStr);
		} else {
			System.out.print("Not the radix");
		}
	}

	public static void Bin2Dec(String inStr) {
		
		double num = 0.0;
		boolean tag = true;

		for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
			char inChar = inStr.charAt(charIdx);
			if (inChar == '1') {
				num = num + Math.pow(2, inStr.length() - charIdx - 1);
			} else if (inChar == '0') {
				num = num + 0;
			} else if (inChar != 0 || inChar != 1) {
				tag = false;
				break;
			}
		}

		if (tag) {
			System.out.printf("The equivalent decimal number for binary \"%s\" is: %d", inStr, (int) num);
		} else {
			System.out.printf("error: invalid binary string \"%s\"\n", inStr);
		}
	}

	public static void Oct2Dec(String inStr) {
		
		int num = 0;

		for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
			char inChar = inStr.charAt(charIdx);
			num = num * 8 + Character.getNumericValue(inChar);
		}
		System.out.printf("The equivalent decimal number \"%s\" is: %d", inStr, num);
	}
	
	public static void Hex2Dex(String inStr) {
		String hexcode = "0123456789ABCDEF";
		int num = 0;
		boolean tag = true;
		String inStr1 = inStr.toUpperCase();
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr1.charAt(charIdx);
			int n = hexcode.indexOf(inChar);
			if (n == -1) {
				tag = false;
				break;
			}
			num = num * 16 + n;
		}
		if (tag) {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", inStr, num);
		} else {
			System.out.printf("error: invalid hexadeincharimal string \"%s\"", inStr);
		}
	}

}
