package hyperSage;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		//int a=10, b=20;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = (a>b)?a:b;
		System.out.println(res+" is bigger value");
	}

}
