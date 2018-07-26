package Module9;

import java.util.*;




public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> set = new HashSet<Integer>();
//Set<Integer> set = new HashSet<Integer>();
set.add(new Integer(12));//Integer is wrapper, an object
set.add(34); // auto-boxing, turn integer to object
set.add(30);
set.add(30);//set is without order, duplicate data will be ignored
set.add(3);
set.add(4);
//set.add("Hello"); set is Integer not String, complie error
System.out.println("contents:"+set);
System.out.println("size:"+set.size());

Iterator<Integer> objs = set.iterator();
while(objs.hasNext()) {
	System.out.println(objs.next()+" element from set, no order");
}

System.out.println("=====");
for(Integer i:set)
	System.out.println(i);
	


	}

}
