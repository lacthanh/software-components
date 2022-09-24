package lab2;

import java.util.*;

public class PrintArray {

	public static void main(String[] args) {
		
        final int NUM_ITEMS;
        int []items;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
        	for (int i = 0; i < items.length; i++) {
        		items[i] = sc.nextInt();
        	}
        }
        sc.close();
        System.out.print("The value are: [");
        for (int i = 0; i < items.length; i++) {
        	if (i == 0) {
        		System.out.print(items[i]);
        	} else if (i == items.length - 1) {
        		System.out.print(", " + items[i] + "]");
        	} else {
        		System.out.print(", " + items[i]);
        	}
        }
	}

}
