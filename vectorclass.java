package collectionfarmework;

import java.util.Collections;
import java.util.Vector;

public class vectorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>v=new Vector<>();
		v.add(2);
		v.addElement(4);
		v.add(5);
		v.add(6);
		v.add(4);
		v.addElement(7);


		System.out.println("vector  list: "+v);
		v.lastElement();
		System.out.println("last element:  "+v.lastElement());

		System.out.println("get vector list: "+v.get(2));
	
	System.out.println("set vector: "+v.set(2, 7));
	System.out.println("capacity vector: "+v.capacity());
	System.out.println("String array"+v);
	Collections.sort(v);
	System.out.println("Sort vector list: "+v);
	System.out.println("index vector "+v.indexOf(4));

	System.out.println(" last index vector "+v.lastIndexOf(4));

	}

}
