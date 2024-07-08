package loopingStmt;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Even numbers upto 100: \n");
		
		for(int i=0; i<=100;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
