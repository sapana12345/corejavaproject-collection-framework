package collectionfarmework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class treesetdemo {

	public static void main(String[] args) {
		//Collection<? extends String> hset = null;
//// TODO Auto-generated method stub
//		HashSet<String> hset=new HashSet<String>();
//		List<String> list=new ArrayList<String>(hset);
//		System.out.println("print element arraylist:"+list);
//
////Object prioroty;
//PriorityQueue<String> p=new PriorityQueue<String>();
//List<String> list1=new ArrayList<String>(p);
//System.out.println("priority element arraylist:"+list1);
TreeSet<String>t=new TreeSet<String>();
t.add("sapna");

t.add("xyz");
t.add("abc");
t.add("kamal");
//t.add(null);
System.out.println("print element tree list:"+t);
System.out.println("print element arraylist:"+t.ceiling("sapana"));

	}
	

}
