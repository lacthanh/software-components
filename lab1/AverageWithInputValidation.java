package lab1;

import java.util.*;

public class AverageWithInputValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        final int NUMSTUDENTS = 3;
        int numberIn;
        boolean isValid;
        double sum = 0;
        double average;
        for (int studentNo = 1; studentNo <= NUMSTUDENTS; studentNo++) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0 to 100) for student " + studentNo + ": ");
                numberIn = sc.nextInt();
                sc.close();
                if (numberIn > 100 || numberIn < 0) {
                    System.out.println("Invalid input , try again ...");
                    continue;
                }
                else isValid = true;
            } while (!isValid);
            sum += numberIn;
        }
        average = sum / NUMSTUDENTS;

        System.out.printf("The average is : %.2f", average);
	}

}
