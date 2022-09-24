package lab2;

import java.util.*;

public class PrintArrayMethod {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of keys: ");
        int key = sc.nextInt();
        System.out.print("Enter the number of array: ");
        int numArray = sc.nextInt();
        System.out.print("Enter the number of array1: ");
        int numArray1 = sc.nextInt();
        int[] array = new int[numArray];
        int []array1 = new int[numArray1];
        
        enterArray(array, sc);
        printArray(array);
        enterArray(array1, sc);
        printArray(array1);
        System.out.println("The value are: " + arrayToString(array));
        
        if (contains(array, key)) {
        	System.out.println("The array contains the number of keys!");
        } else {
        	System.out.println("The array doesn't contain the number of keys!");
        }
        
        System.out.println("The index of the key number is " + search(array, key));
        
        if (equals(array, array1)) {
        	System.out.println("Two arrays are the same!");
        } else {
        	System.out.println("Two arrays are different!");
        }
        
        System.out.print("The copy of the array is: ");
        printArray(copyOf(array));
        
        if (swap(array, array1)) {
        	System.out.println("Two arrays successfully swapped contents!");
        } else {
        	System.out.println("Two arrays swapped contents unsuccessfully!");
        }
        
        reverse(array);
	}
	
	public static void enterArray(int []array, Scanner sc) {
		System.out.print("Enter the value of all array (separated by space): ");
        if (array.length > 0) {
        	for (int i = 0; i < array.length; i++) {
        		array[i] = sc.nextInt();
        	}
	    }
	}
	
	public static void printArray(int []array) {
		System.out.print("The value are: ");
        for (int i = 0; i < array.length; i++) {
        	if (i == 0) {
        		System.out.print("[" + array[i]);
        	} else if (i == array.length - 1) {
        		System.out.print(", " + array[i] + "]");
        	} else {
        		System.out.print(", " + array[i]);
        	}
        }
        System.out.println();
	}
	
	public static String arrayToString(int []array) {
		String inStr = "";
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				inStr += "[" + String.valueOf(array[i]);
			} else if (i == array.length - 1) {
				inStr += ", " + String.valueOf(array[i]) + "]";
			} else {
				inStr += ", " + String.valueOf(array[i]);
			}
		}
		return inStr;
	}
	
	public static boolean contains(int []array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}
	
	public static int search(int []array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean equals(int []array1, int []array2) {
		if (array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}
		return true;
	}
	
	public static int[] copyOf(int []array) {
		if (array == null)
			return null;
		int []arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}
		return arr;
	}
	
	public static boolean swap(int []array1, int []array2) {
		if (array1 == null || array2 == null || array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++) {
			int temp = array1[i];
			array1[i] = array2[i];
			array2[i] = temp;
		}
		return true;
	}
	
	public static void reverse(int []array) {
		int fldx = 0;
		int bldx = array.length - 1;
		System.out.print("The reverse of array is ");
		while (fldx < bldx) {
			int temp = array[fldx];
			array[fldx] = array[bldx];
			array[bldx] = temp;
			fldx++;
			bldx--;
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else if (i == array.length - 1) {
				System.out.print(", " + array[i] + "]");
			} else {
				System.out.print(", " + array[i]);
			}
		}
	}

}
