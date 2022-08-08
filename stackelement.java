package collectionfarmework;

import java.util.Stack;

public class stackelement {

	//private static Object public Iterator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();

		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println("push element of stack:"+s);
		System.out.println("pop element of stack:"+s.pop());
		System.out.println("push element of stack:"+s);

		System.out.println("empty element of stack:"+s.empty());
		System.out.println("push element of stack:"+s);
		System.out.println("peek element of stack:"+s.peek());
		System.out.println("push element of stack:"+s);
		System.out.println("search element of stack:"+s.search(4));
		System.out.println("capacity element of stack:"+s.capacity());
		
		System.out.println("String array"+s.addAll(1, s));
		System.out.println("String array"+s);
		
		System.out.println("index vector "+s.indexOf(4));

		System.out.println(" last index vector "+s.lastIndexOf(4));
		//Iterator descendingIterator(s);
			
		




		
		

		
	}

	private static void descendingIterator() {
		// TODO Auto-generated method stub
		
	}

	private static void dcendingIterator() {
		// TODO Auto-generated method stub
		
	}

}
