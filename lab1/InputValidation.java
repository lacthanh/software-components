package lab1;

import java.util.*;

public class InputValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int numberIn;
        boolean isValid;
        isValid = false;
        do {
            System.out.print("Enter the number between 0 to 10 or 90 to 100: ");
            numberIn = sc.nextInt();
            sc.close();
            if (!(numberIn > 0 && numberIn < 10) && !(numberIn < 100 && numberIn>90)) {
                System.out.println("Invalid input , try again ...");
                continue;
            }
            else isValid = true;
        } while (!isValid);
    System.out.println("You have entered: " + numberIn);
	}

}
