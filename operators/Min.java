package hyperSage;

public class Min {
	public static void main(String[] args){
		int a=80, b=40, c=100, d=20;
		int min = (a < b)?
				  (a < c)?
				  ((a < d)? a : d):
				  ((c < d)? c : d):
				  (b < c)?
				  ((b < d)? b : d):
				  ((c < d)? c : d);

		System.out.println("Minimum value is: "+min);
		
	}
}
