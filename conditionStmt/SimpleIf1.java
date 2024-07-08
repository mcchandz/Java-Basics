package conditionStmt;

import java.util.*;

public class SimpleIf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
		if(num >= 10) {
			System.out.println(num+" is greater than or equal to 10");
		}
	}
}
