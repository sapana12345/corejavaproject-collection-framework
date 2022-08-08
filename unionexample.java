package collectionfarmework;

import java.util.HashSet;

public class unionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<>();
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		// TODO Auto-generated method stub
		HashSet<Integer> s1=new HashSet<>();
		s1.add(3);
		s1.add(5);
		s1.add(9);
		s1.add(1);
		System.out.println("element is hashset  intersection:"+s);
		System.out.println("element is hashset  intersection:"+s1);

		System.out.println("element is hashset:"+s1.retainAll(s));
		System.out.println("element is hashset  intersection:"+s1.containsAll(s));
		System.out.println("element is hashset  union:"+s1.addAll(s));
		System.out.println("element is hashset  difference:"+s.removeAll(s1));
		System.out.println("element is hashset  intersection:"+s);


	}

}
