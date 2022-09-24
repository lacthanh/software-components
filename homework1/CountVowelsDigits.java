package homework1;

import java.util.*;

public class CountVowelsDigits {

	public static void main(String[] args) {
		
		String inStr;
		int numberVow;
		int numberDig;
		int inStrLen;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		inStr = sc.nextLine().toLowerCase();
		sc.close();
		
		numberVow = numberVowels(inStr);
		numberDig = numberDigits(inStr);
		inStrLen = inStr.length();

		System.out.printf("Number of Vowels: %d (%.2f%%)\n", numberVow, (double) numberVow * 100 / inStrLen);
		System.out.printf("Number of Digits: %d (%.2f%%)\n", numberDig, (double) numberDig * 100 / inStrLen);
	}

	public static int numberVowels(String inStr) {
		int count = 0;
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			if (inChar == 'a' || inChar == 'e' || inChar == 'i' || inChar == 'o' || inChar == 'u') {
				count++;
			}
		}
		return count;
	}

	public static int numberDigits(String inStr) {
		int count = 0;
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			if (inChar >= '0' && inChar <= '9') {
				count++;
			}
		}
		return count;

	}

}
