package homework1;

import java.util.*;

public class ExchangeCipher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a plaintext string: ");
		String inStr = sc.next().toUpperCase();
		sc.close();
		System.out.print("The ciphertext string is: ");
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			char result = (char) ('A'+'Z'- inChar);
			System.out.print(result);
		}

	}

}
