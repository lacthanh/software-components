package lab1;

import java.util.*;

public class ReverseInt {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
        int inNumber;
        int newNumber = 0;
        System.out.print("Enter a positive integer: ");
        inNumber= sc.nextInt();
        sc.close();
        while (inNumber > 0) {
            newNumber = 10 * newNumber + inNumber % 10;
            inNumber /= 10;
        }
        System.out.println("The reserve is: " + newNumber);

	}

}
