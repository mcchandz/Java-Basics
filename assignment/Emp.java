package assignment;

public class Emp {
	public void display(int a) {
		System.out.println(a);
	}
	public void display(double b) {
		System.out.println(b);
	}
	public void display(int a, double b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void display(double a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Emp e = new Emp();
		e.display(2);
		e.display(7.8);
		e.display(1, 2.00);
		e.display(1.0, 0);
	}
}
