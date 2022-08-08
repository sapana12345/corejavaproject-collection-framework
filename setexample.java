package collectionfarmework;

import java.util.HashSet;
//import java.net.Socket;
//import java.util.BitSet;
import java.util.Set;

public class setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> st=new HashSet<>(8,(float)0.50);
HashSet<Integer> s=new HashSet<>();
HashSet<Integer> sh=new HashSet<>();
//HashSet<Integer> sh1=new HashSet<>();


HashSet<String> s1=new HashSet<String>();
s.add(1);
s.add(2);
s.add(3);
s.add(4);
s.add(null);
//sh1.addAll(sh);

s1.add("sapna");

s1.add("xyz");
s1.add("abc");
s1.add("kamal");
s1.add(null);
System.out.println("element is hashset:"+s);
System.out.println("element is hashset:"+s1);
System.out.println("element is hashcode:"+s.hashCode());

System.out.println("element is hashcode string:"+s1.hashCode());
System.out.println("element is hashset size in integer:"+s1.size());
System.out.println("element is hashset size is string:"+s.size());
System.out.println("element is hashset clone is string:"+s1.clone());
System.out.println("element is hashset clone is integer:"+s.clone());
System.out.println("element is hashset contains ofstring :"+s1.contains("xyz"));
System.out.println("element is hashset contain of ingteger :"+s.contains(3));

System.out.println("element is hashset inserted:"+st);
s.addAll(sh);


System.out.println("element is hashset:"+s);







	}

}
