package lab2;

import java.util.*;

public class GradesHistogram {

	public static void main(String[] args) {
        
        final int numStudents;
        int[] grades;
        int[] countGrade = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

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
                countGrade[(grades[i] / 10 == 10) ? 9 : grades[i] / 10]++;
            }
        }
        sc.close();
        
        System.out.println();
        for (int i = 0; i < countGrade.length; i++) {
            int delta = (i == countGrade.length - 1) ? 10 : 9;
            System.out.printf("%2d - %3d:", (i * 10), (i * 10 + delta));
            for(int j = 0; j < countGrade[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int mod = -1;
        for (int i = 0; i < countGrade.length; i++) {
            mod = (countGrade[i] > mod) ? countGrade[i] : mod;
        }
        for (int i = mod; i >= 0; i--) {
            if (i == 0) {
                for (int j = 0; j < countGrade.length; j++) {
                    int delta = (j == countGrade.length - 1) ? 10 : 9;
                    System.out.printf("%2d-%-2d ", (j * 10), (j * 10 + delta));
                }
            } else {
                for (int j = 0; j < countGrade.length; j++) {
                    String str = (countGrade[j] < i) ? " " : "*";
                    System.out.printf("%3s%-2s ", str, " ");
                }
            }
            System.out.println();
        }
	}

}
