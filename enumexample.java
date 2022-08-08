package collectionfarmework;

import java.awt.Color;
//import java.awt.Color;
import java.util.EnumSet;
import java.util.Iterator;

public class enumexample {
	enum Color{
		red, pink,bule,green,white, ;
	}
	private static final Color Color = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Color> c= EnumSet.allOf(Color.class);
		
		System.out.println("empty enumset:"+c);

		EnumSet<Color> c1= EnumSet.range(Color.red,Color.white);
		//EnumSet<Color> c2= EnumSet.setOf(Color.red,Color.white);
		//c1.addAll();
		System.out.println("range of enumset:"+c1);
		Iterator<Color> itr=c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		//EnumSet<Color> c2= EnumSet.noneOf(Color.yellow);
	}

}
