package functions;

import java.util.Scanner;

public class ArgNoReturn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		add(a,b);
				
	}
	public static void add(int x, int y) {
		int res = x+y;
		System.out.println("Addition result is: "+res);
	}

}
