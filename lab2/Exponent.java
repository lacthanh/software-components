package lab2;

import java.util.*;

public class Exponent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent: ");
		int exp = sc.nextInt();
		sc.close();
		
		System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
	}
	
	public static int exponent(int base, int exp) {
		
		int product = 1;
		for (int i = 0; i < exp; i++) {
			product *= base;
		}
		return product;
	}

}
