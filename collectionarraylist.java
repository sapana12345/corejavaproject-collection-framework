package collectionfarmework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionarraylist {

	public static void main(String[] args) {
List<String>li=new ArrayList();
li.add("sapana");
li.add(0, "kamal");
li.add(1, "ashwini");
li.add(2, "pooja");
li.add(3, "kajal");
System.out.println("list of element:"+li);
System.out.println("length of list:"+li.size());
System.out.println("set of element:"+li.set(0, "komal"));
System.out.println("get of element:"+li.get(2));
System.out.println("list of element:"+li);

System.out.println("remove of element:"+li.remove(1));
System.out.println("list of element:"+li);
System.out.println("contain of element:"+li.contains("pooja"));
String[]arr=li.toArray(new String[li.size()]);
for(String x:arr) {
	System.out.println("String array"+x);

}
Iterator itr=li.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());

}


	}

}
