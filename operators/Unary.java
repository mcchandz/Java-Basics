package hyperSage;

import java.util.*;

public class Unary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = 10;
        
        int postin = a++;
        int prein = ++a;
        int prede = --a;
        int postde = a--;
     
        System.out.println("Post increment value: "+postin);
        System.out.println("Pre increment value: "+prein);
        System.out.println("Pre decrement value: "+prede);
        System.out.println("Post decrement value: "+postde);
     	}
}
