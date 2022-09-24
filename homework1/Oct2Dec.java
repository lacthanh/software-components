package homework1;

import java.util.*;

public class Oct2Dec {

	public static void main(String[] args) {
		
		String inStr;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Octal string: ");
		inStr = sc.next();
		sc.close();
		
		for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
			char inChar = inStr.charAt(charIdx); 
			num = num * 8 + Character.getNumericValue(inChar);
		}
		System.out.printf("The equivalent decimal number \"%s\" is: %d", inStr, num);
	}

}
