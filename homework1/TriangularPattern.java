package homework1;

import java.util.*;

public class TriangularPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();
        
        printTriangularPatternA(size);
        printTriangularPatternB(size);
        printTriangularPatternC(size);
        printTriangularPatternD(size);
    }

	public static void printTriangularPatternA(int size) {
		
		System.out.println("Triangular pattern A:");
		
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
	}
	
	public static void printTriangularPatternB(int size) {
		
		System.out.println("Triangular pattern B:");
		
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
	
	public static void printTriangularPatternC(int size) {
		
		System.out.println("Triangular pattern C:");
		
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
	
	public static void printTriangularPatternD(int size) {
		
		System.out.println("Triangular pattern D:");
		
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
