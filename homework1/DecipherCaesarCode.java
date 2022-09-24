package homework1;

import java.util.*;

public class DecipherCaesarCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a ciphertext string: ");
		String inStr = sc.next().toUpperCase();
		sc.close();
		System.out.print("The plaintext string is: ");
		caesar(inStr);
	}

	public static void caesar(String inStr) {
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			if (inChar >= 'D' && inChar <= 'Z') {
				inChar = (char) ((char) inChar - 3);
				System.out.print(inChar);
			} else if (inChar == 'A') {
				System.out.print('X');
			} else if (inChar == 'B') {
				System.out.print('Y');
			} else if (inChar == 'C') {
				System.out.print('Z');
			}
		}
	}

}
