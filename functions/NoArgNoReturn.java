package functions;

import java.util.Scanner;

public class NoArgNoReturn {
	 public static void main(String[] args) {
		 add();
	  }
	  public static void add() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter two numbers: ");
		  int a =sc.nextInt();
		  int b =sc.nextInt();
		  int res = a+b;
		  System.out.println("Addition result is: "+res);	  
	  }
}
