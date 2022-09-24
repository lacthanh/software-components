package lab2;

import java.util.*;

public class GradesStatistics {

	public static void main(String[] args) {
		
		int numStudents;
		int max = 101;
		int min = -1;
		double sum = 0;
		double average = 0.0;
		int []grades;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		numStudents = sc.nextInt();
		grades = new int[numStudents];
		
		if (numStudents > 0) {
            for (int i = 0; i < numStudents; i++) {
                System.out.printf("Enter the grade for students %d: ", (i + 1));
                grades[i] = sc.nextInt();
                while ((i < 0) && (i > 100)) {
                    System.out.print("Invalid. Retry: ");
                    grades[i] = sc.nextInt();
                }
                if (grades[i] < min)
                	min = grades[i];
                if (grades[i] > max)
                	max =  grades[i];
                sum += grades[i];
            }
            average = sum / numStudents;
		sc.close();
		
		System.out.printf("The average is: %2.2f\nThe minimum is: %d\nThe maximum is: %d", average, min, max);
	    } 
	}

}
