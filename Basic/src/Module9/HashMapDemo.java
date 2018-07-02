package Module9;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String>tel=new HashMap<>();
		tel.put("John","0938312099");
		tel.put("Mary","0938312455");
		tel.put("Jean","0938312666");
		String tel1=tel.get("Mary");
		System.out.println(tel1);
		
		for(String key:tel.keySet())
			System.out.println(key+","+tel.get(key));
		
		for(String val:tel.values())
			System.out.println(val);

	}
}
