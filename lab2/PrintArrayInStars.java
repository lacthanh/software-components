package lab2;

import java.util.*;

public class PrintArrayInStars {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int numItems = sc.nextInt();
        int[] items = new int[numItems];
        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
        	for (int i = 0; i < items.length; i++) {
        		items[i] = sc.nextInt();
        	}
        }
        sc.close();
        for (int idx = 0; idx < items.length; idx++) {
        	System.out.print(idx + ": ");
        	for (int starNo = 1; starNo <= items[idx]; starNo++) {
        		System.out.print("*");
        	}
        	System.out.printf("(%d)", items[idx]);
        	System.out.println();
        }
	}

}
