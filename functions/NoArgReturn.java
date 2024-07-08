package functions;

import java.util.Scanner;

public class NoArgReturn {
	public static void main(String[] args) {
		System.out.println("Addition result is: "+add());			
	}
	public static int add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = a+b;
		return res;
	 }
	}

