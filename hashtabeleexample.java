package collectionfarmework;

import java.util.Hashtable;
import java.util.TreeMap;

public class hashtabeleexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hashtable<String,Integer>ht=new Hashtable<>();
//
//ht.put("xyz", 1);
//ht.put("abc", 2);
//ht.put("xyz1", 3);
//ht.put("abc12", 4);
//ht.put("wxy", 5);
//System.out.println("elemnt of hashtable: "+ht);
TreeMap<Integer, String> tm=new TreeMap<>();
tm.put(1, "fgy");
tm.put(2, "null");
tm.put(1, "fgy");
tm.put(2, "null");

tm.put(1, "fgy");
tm.put(2, "null");
tm.put(1, "fgy");
tm.put(2, "null");

//tm.put(1, "fgy");
//tm.put(1, "fgy");
System.out.println("elemnt of map tree: "+tm);
System.out.println("elemnt of map tree: "+tm.descendingMap());
System.out.println("elemnt of map tree: "+tm);




	}

}
