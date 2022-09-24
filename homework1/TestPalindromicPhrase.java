package homework1;

import java.util.*;

public class TestPalindromicPhrase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Word or Phrase: ");
		String inStr = sc.nextLine();
		sc.close();
		if (testPalindromicWord(inStr)) {
			System.out.printf("\"%s\" is a palindrome", inStr);
		} else {
			System.out.printf("\"%s\" is not a palindrome", inStr);
		}
	}
	
	public static boolean testPalindromicWord(String inStr) {
		inStr = inStr.toLowerCase();
		inStr = inStr.trim();
		inStr = inStr.replaceAll("[^a-z]","");
		int fldx = 0;
		int bldx = inStr.length() - 1;
		while (fldx < bldx) {
			char forwardChar = inStr.charAt(fldx);
			char backwardChar = inStr.charAt(bldx);
			if (forwardChar != backwardChar) {
				return false;
			}
			fldx++;
			bldx--;
		}
		return true;
	}

}
