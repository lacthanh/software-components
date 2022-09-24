package homework1;

import java.util.*;

public class CheckerPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		sc.close();
		for (int row=0; row<size; row++) {
			for (int col=0; col<size; col++) {
				if ((row % 2) == 1) {
					System.out.print(" #");
				} else {
				    System.out.print("# ");
			    }
			}
			System.out.println();
		}
	}

}
