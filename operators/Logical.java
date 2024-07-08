package hyperSage;

import java.util.*;

public class Logical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1%2==0) && (num2%2==0)) {
			System.out.println("Both numbers are even");
		}else if((num1%2==0) || (num2%2==0)) {
			System.out.println("Either "+num1+" or "+num2+" is even");
		}
	}

}
