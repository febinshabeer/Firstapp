import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Intermediate---Map,Filter,Sort
//terminal--collect,foreach,reduce
public class Demo1 { 

	public static void main(String[] args) {
		
		List<Integer> intlist=Arrays.asList(5,6,12,13,43);

		List output=intlist.stream().map(i->i*2).collect(Collectors.toList());
		output.forEach(i->System.out.println(i));
	}

}
