package collectionfarmework;

import java.util.HashMap;
import java.util.Map;

public class mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("pink", 3);
		hm.put("red", 4);
		
		hm.put("yellow", 5);
		hm.put("green", 6);
		hm.put("pink", 9);
		hm.putAll(hm);
		//for(Map.Entry<, V>)

System.out.println("print the element of hashmap"+hm);
System.out.println("print the element of hashmap put absent "+hm.putIfAbsent("red", 4));
System.out.println("print the element of hashmap key set "+hm.keySet());
System.out.println("print the element of hashmap replace"+hm.replace("pink", 9));
System.out.println("print the element of hashmap size "+hm.size());
System.out.println("print the element of hashmap contain key:"+hm.containsKey("black"));
System.out.println("print the element of hashmap contain key:"+hm.containsKey("red"));

System.out.println("print the element of hashmap"+hm);
	}

}
