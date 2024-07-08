package loopingStmt;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiples of 5 upto 100: \n");
		
		for(int i=0; i<=100;i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
	}

}
