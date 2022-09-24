package lab2;

import java.util.*;

public class GradesStatistic2_11 {

	public static void main(String[] args) {
	
		int numStudents;
		int max = 101;
		int min = -1;
		double average = 0.0;
		double median;
		double stdDev;
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
            }
            sc.close();
            
            average = calAvg(grades);
            median = calMedian(grades);
            stdDev = calStandardDeviatation(grades);
            printArray(grades);
            System.out.printf("The average is: %2.2f\nThe median is: %2.2f\n" + "The minimum is: %d\nThe maximum is: %d" + "\nThe standard deviatation is: %.2f",
            average, median, max, stdDev);
		}

	}
		
	public static void printArray(int[] array) {
		System.out.print("The grades are: ");
        if (array.length == 1) {
        	System.out.print("[" + array[0] + "]");
        } else {
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
        System.out.println();
	}
	
	public static double calAvg(int[] array) {
        if (array.length == 0) 
        	return 0;
        double sum = 0.0;
        for (int i = 0; i < array.length; ++i)
            sum += array[i];
        double average = sum / array.length;
        return average;
    }
	
	public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
	
	 public static double calMedian(int array[]) {
	     int n = array.length;
	     sortArray(array);
	     if (n % 2 != 0)
	         return (double) array[n / 2];
	     return (double) (array[(n - 1) / 2] + array[n / 2]) / 2.0;
	 }
	 
	 public static double calStandardDeviatation(int array[]) {
	     int n = array.length;
	     double avg = calAvg(array);
	     double stdDev = 0.0;
	     for (int i = 0; i < n; i++) 
	         stdDev = stdDev + Math.pow((array[i] - avg), 2);
	     stdDev = Math.sqrt(stdDev / n);
	     return stdDev;
	 }

}
