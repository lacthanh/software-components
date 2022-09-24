package lab2;

import java.util.*;

public class Hex2Bin {

	public static void main(String[] args) {
		
		String []hexBit = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		String hexCode = "0123456789ABCDEF";
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Hexadecimal string: ");
		String inStr1 = sc.next();
		String inStr = inStr1.toUpperCase();
		sc.close();
		
		System.out.printf("The equivalent binary for hexadecimal \"%s\" is: ", inStr1);
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx);
			int n = hexCode.indexOf(inChar);
			System.out.print(hexBit[n] + " ");
		}
	}

}
