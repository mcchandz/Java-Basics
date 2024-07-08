package hyperSage;

import java.util.*;

public class Relational {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("Both numbers are equal");
		}else {
			System.out.println("Both numbers are not equal");
		if(num1 > num2) {
			System.out.println(num1+" is greater");
		}
		else if (num1 < num2){
			System.out.println(num1+" is smaller");
		}
      }
	}
}
