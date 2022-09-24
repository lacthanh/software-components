package homework1;

import java.util.*;

public class HillPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the row: ");
        int numRows = sc.nextInt();
        sc.close();
        
        printHillPatternA(numRows);
        printHillPatternB(numRows);
        printHillPatternC(numRows);
        printHillPatternD(numRows);
    }

    public static void printHillPatternA(int numRows) {
    	
    	System.out.println("Hill pattern A:");
    	
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printHillPatternB(int numRows) {
    	
    	System.out.println("Hill pattern B:");
    	
        for (int row = 0; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((col <= 2 * numRows - 1 - row) && (col > row)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printHillPatternC(int numRows) {
    	
    	System.out.println("Hill pattern C:");
    	
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((col <= 2 * numRows - 1 - row) && (col > row)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printHillPatternD(int numRows) {
    	
    	System.out.println("Hill pattern D:");
    	
        for (int col = 1; col <= 2 * numRows - 1; col++) {
            System.out.print("# ");
        }
        System.out.println();
        
        for (int row = 1; row < numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        for (int row = 2; row < numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((col <= 2 * numRows - 1 - row) && (col > row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        for (int col = 1; col <= 2 * numRows - 1; col++) {
            System.out.print("# ");
        }
        System.out.println();
	}

}
