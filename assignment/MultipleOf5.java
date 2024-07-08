package assignment;

public class MultipleOf5 {
	public static void main(String[] args){
		int num = 25;
		while(num>1) {
			if(num%5 == 0) {
				System.out.println(num);
			}
			num--;
		}
	}
}
