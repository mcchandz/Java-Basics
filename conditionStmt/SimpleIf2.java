package conditionStmt;

import java.util.*;

public class SimpleIf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person to see the eligibility for voting: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("The person is eligible to vote");
		}
	}
}
