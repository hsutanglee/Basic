package Module9;
import java.util.*;
public class GenericsDemo1 {

	public static void print(List<?>list) {
		Iterator <?> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(2);
		print(list1);

		List<String> list2 = new ArrayList<>();
		list2.add("John");
		list2.add("Mary");
		list2.add("Mary2");
		list2.add("Mary3");
		print(list2);


	}

}
