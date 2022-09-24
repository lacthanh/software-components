package lab1;

import java.util.*;

public class CircleComputation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.printf("Enter the heigh: ");
		double heigh = sc.nextDouble();
        sc.close();
        double diameter = 2 * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f\nArea is: %.2f\nCircumference is: %.2f", diameter, area, circumference);
        
        SphereComputation(radius);
        CylinderComputation(radius, heigh);
	}
	
	public static void SphereComputation(double radius) {
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		System.out.printf("\nSurface area is: %.2f\nVolume is: %.2f", surfaceArea, volume);
	}
	
	public static void CylinderComputation(double radius, double heigh) {
		double baseArea = Math.PI * Math.pow(radius, 2);
		double surfaceArea = 2 * Math.PI * radius + 2 * baseArea;
		double volume = baseArea * heigh;
		System.out.printf("\nBase area is: %.2f\nSurface area is: %.2f\nVolume is: %.2f", baseArea, surfaceArea, volume);
	}
	
}
