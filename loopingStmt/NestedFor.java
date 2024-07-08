package loopingStmt;

import java.util.Scanner;

public class NestedFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in matrix: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter "+row*col+" elements for matrix: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix you have entered is");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
