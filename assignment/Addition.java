package assignment;

public class Addition {
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		int res = add(10, 20, 30);
		System.out.println("Addition result is: "+res);
	}
}
