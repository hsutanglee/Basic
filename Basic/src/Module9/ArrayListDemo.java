package Module9;

import java.util.*;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();

		list.add(new Integer(12));
		list.add(34);
		
		System.out.println("contents:"+list);
		System.out.println("size:"+list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println("value:"+list.get(i));
}


	}

}
