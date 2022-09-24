package lab2;

import java.util.*;

public class Dec2Hex {

	public static void main(String[] args) {
		
		char []hexCode = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		String inStr = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		int num = sc.nextInt();
		sc.close();
		
		while (num > 0) {
			int n = num % 16;
			inStr = hexCode[n] + inStr;
			num /= 16;
		}
		
		System.out.println("The equivalent hexadecimal number is " + inStr);
	}

}
