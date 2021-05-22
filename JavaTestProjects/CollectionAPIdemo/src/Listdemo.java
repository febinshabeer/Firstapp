import java.util.ArrayList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(18);
        l1.add(119);
        l1.add(187);
        System.out.println(l1);
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(12);
        l2.add(112);
        l2.add(1112);
        l1.addAll(l2);
        System.out.println("after adding all: "+l1);
        l1.add(1,100);
        System.out.println("after adding 1 element as 100"+l1);
        
        l1.add(0,200);
        System.out.println("after adding 0th element as 200"+l1);
        
        List<Integer> l3=new ArrayList<Integer>();
        l3.add(19);
        l3.add(20);
        l1.addAll(1, l3);
        System.out.println(l1);
        List<Integer> l4=new ArrayList<Integer>();
        l4.clear();
        System.out.println(l4);
        System.out.println(l1.contains(777));
	}

}
