package homework2;

import java.util.*;

public class NumberGuess {

	public static void main(String[] args) {
		
        final int SECRET_NUMBER = (int) (Math.random()*100);
        int inputNumber;
        int trailsCount = 1;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Key in your guess:");
        inputNumber = sc.nextInt();
        while (inputNumber != SECRET_NUMBER) {
            System.out.println((inputNumber > SECRET_NUMBER) ? "Try lower" : "Try higher");
            trailsCount++;
            inputNumber = sc.nextInt();
        }
        sc.close();
        System.out.printf("You got it in %d trails!", trailsCount);
	}

}
