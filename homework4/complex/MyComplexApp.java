package homework4.complex;

import java.util.Scanner;

public class MyComplexApp {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        MyComplex[] complexes = new MyComplex[2];
        double realNum;
        double imagNum;
        for (int i = 1; i < 3; i++) {
            System.out.printf("Enter complex number %d (real and imaginary part): ", i);
            realNum = sc.nextDouble();
            imagNum = sc.nextDouble();
            complexes[i - 1] = new MyComplex(realNum, imagNum);
        }
        sc.close();
        System.out.println();
        
        String check;
        for (int i = 1; i < 3; i++) {
            System.out.printf("Number is %d: %s%n", i, complexes[i - 1]);
            if (complexes[i - 1].isReal()) {
            	check = "";
            } else {
            	check = "NOT";
            }
            System.out.printf("%s is %s a pure real number%n", complexes[i - 1], check);
            if (complexes[i - 1].isImagine()) {
            	check = "";
            } else {
            	check = "NOT";
            }
            System.out.printf("%s is %s a pure imaginary number%n", complexes[i - 1], check);
            System.out.println();
        }
        
        if (complexes[0].hasEquals(complexes[1])) {
        	check = "";
        } else {
        	check = "NOT";
        }
        System.out.printf("%s is %s equals to %s%n", complexes[0], check, complexes[1]);
        
        System.out.printf("%s + %s = %s%n", complexes[0], complexes[1], complexes[0].addNew(complexes[1]));
        System.out.printf("%s - %s = %s%n", complexes[0], complexes[1], complexes[0].subtractNew(complexes[1]));
        System.out.printf("%s * %s = %s%n", complexes[0], complexes[1], complexes[0].multiplyNew(complexes[1]));
        System.out.printf("%s / %s = %s%n", complexes[0], complexes[1], complexes[0].divideNew(complexes[1]));
	}

}
