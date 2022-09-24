package homework1;

import java.util.*;

public class TimeTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		sc.close();
		for (int row = -1; row <= size; row++) {
			if (row == -1) {
				System.out.printf("%2c%1c|",'*',' ');
			} else if (row == 0) {
				System.out.print("-----");
			} else if (row > 0) {
				System.out.printf("%2d%1c|", row,' ');
			}
			for (int col = 1; col <= size; col++) {
				if(row == -1) {
					System.out.printf("%4d", col);
				} else if (row == 0) {
					System.out.print("----");
				} else if (row > 0) {
					System.out.printf("%4d", col * row);
				}
			}
			System.out.println();
		}

	}

}
