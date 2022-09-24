package homework1;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String inStr = sc.next();
		sc.close();
		int inStrLen = inStr.length();
		char []index = inStr.toCharArray();
		System.out.print("The reverse of the String \"" + inStr + "\" is \"");
		for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
			System.out.print(index[charIdx]);
		}
		System.out.print("\"");
	}

}
