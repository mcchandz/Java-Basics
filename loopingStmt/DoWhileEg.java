package loopingStmt;

import java.util.Scanner;

public class DoWhileEg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of iterations to be carried out: ");
		int i = sc.nextInt();
		int cnt = 0;

		do {
			cnt++; 
			i--;
		}while(i>0);
		System.out.println("Number of iterations done: "+cnt);
	}

}
