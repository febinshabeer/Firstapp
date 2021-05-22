import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listdemo2 {

	public static void main(String[] args) {
		
		List<String> fruits=new ArrayList<>();
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		System.out.println(fruits);
		for(String fr :fruits)
			System.out.println(fr);
        String array1[]= {"h1","h2","h3"};
        for(String s:array1)
       	   System.out.println(s);
        System.out.println(Arrays.toString(array1));
        List<Integer> num=new ArrayList<Integer>();
        num.add(11);
        num.add(1);
        num.add(32);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
	}

}
