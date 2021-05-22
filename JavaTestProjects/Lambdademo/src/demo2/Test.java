package demo2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		al.forEach(n->System.out.println(n));
		
		al.forEach(n-> {if(n%2==0)System.out.println(n);});
		
		

	}

}
