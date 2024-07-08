package assignment;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float rad = sc.nextFloat();
		System.out.println("Area of circle= "+area(rad));
	}
	
	public static double area(float r) {
		double ar = 2*(3.142)*r*r;
		return ar;
	}

}
