package homework1;

import java.util.*;

public class CeasarCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a plaintext string: ");
		String inStr = sc.next().toUpperCase();
		sc.close();
		System.out.print("The ciphertext string is: ");
		caesar(inStr);
	}

	public static void caesar(String inStr) {
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			if (inChar >= 'A' && inChar <= 'W') {
				inChar = (char) (inChar + 3);
				System.out.print(inChar);
			} else if (inChar == 'X') {
				System.out.print('A');
			} else if (inChar == 'Y') {
				System.out.print('B');
			} else if (inChar == 'Z') {
				System.out.print('C');
			}
		}

	}

}
