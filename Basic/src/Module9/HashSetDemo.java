package Module9;

import java.util.*;




public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> set = new HashSet<Integer>();
//Set<Integer> set = new HashSet<Integer>();
set.add(new Integer(12));
set.add(34);
//set.add("Hello");
System.out.println("contents:"+set);
System.out.println("size:"+set.size());

Iterator<Integer> objs = set.iterator();
while(objs.hasNext()) {
	System.out.println(objs.next());
}
for(Integer i:set)
	System.out.println(i);
	


	}

}
