package hyperSage;

import java.util.*;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Arithmetic a = new Arithmetic();
		
		System.out.println("Addition: "+a.add(num1, num2));
		System.out.println("Subtration: "+a.sub(num1, num2));
		System.out.println("Multiplication: "+a.mul(num1, num2));
		System.out.println("Division: "+a.div(num1, num2));
		System.out.println("Modulus: "+a.mod(num1, num2));
		 
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		int res = 0;
		try {
		res =  a/b;
		} catch (ArithmeticException e) {
			System.out.println("Not divisible by zero");
			
		}
		return res;
	}
	public int mod(int a, int b) {
		return a%b;
	}

}
