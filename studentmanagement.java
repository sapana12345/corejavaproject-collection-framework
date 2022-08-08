package collectionfarmework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class SortByNames implements Comparator<student>{

	@Override
	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		return
		s1.getName().compareTo(s2.getName());
	}
	
}

public class studentmanagement {

	private static Object i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,choice;
		String name ,city;
		ArrayList<student> al=new ArrayList<student>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("press 1 for add student details");
			System.out.println("press 2show student dtailas " );
			System.out.println("press 3 for  search student name");
		System.out.println("press 4 for delete by name ");
		System.out.println("press 5 for update by age ");
		System.out.println("press 6 for sort record  by name ");
		System.out.println("press 7 for exit ");

			System.out.println("enter your choice");
			
			choice=sc.nextInt();
			
			
		
			switch(choice) {
			case 1:
				
			
				System.out.println("ennter the sudent name:");
				name=sc.next();
				System.out.println("ennter the student city:");
				city=sc.next();
				System.out.println("ennter the student age:");
				age=sc.nextInt();
				student s=new student();
				s.setName(name);
				s.setCity(city);
				s.setAge(age);
				al.add(s);
				
				System.out.println("ennter the student record added:");
				System.out.println("...................................................................");

break;
			
			
			case 2:
				for(int i=0;i<al.size();i++) {
					System.out.println("enter the student record:"+(i+1));
				
			System.out.println("ennter the sudent name:"+al.get(i).getName()+"\n studentage");
			
					System.out.println("ennter the sudent age:"+al.get(i).getAge()+"\nstudent city");
					System.out.println("ennter the sudent city:"+al.get(i).getCity());
				
					System.out.println("...................................................................");
					break;		
				}
			case 3:
				System.out.println("ennter the sudent name for search:");
				 String name1=sc.next();
				int count=0;
				for(int i=0;i<al.size();i++);{
					int i = 0;
					if(al.get(i).getName().contains(name1)) {
						System.out.println("ennter student record:"+(i+1));
						System.out.println("ennter the sudent name:"+al.get(i).getName());
						System.out.println("ennter the sudent age:"+al.get(i).getAge());
						System.out.println("ennter the sudent city:"+al.get(i).getCity());
						count++;

						
					}
				}
				if(count==0) {
					System.out.println("no og record found for that name");

				}
				else {
					System.out.println("search record by name opreation done successfully");

				}
				System.out.println("...................................................................");

				break;
					
				
			case 4:
				System.out.println("ennter name to delete record ");
				
				String name2=sc.next();
				int i;
				int count1=0;
				for( i=0;i<al.size();i++);{
					if(al.get(i).getName().contains(name2)) {
						System.out.println("student record:"+(i+1));
						al.remove(i);
						count1++;
						
					}
				}
if(count1==0) {
	System.out.println("record not found ");
	
}
else {
	System.out.println("ennter record to delete successfully.........");
}
System.out.println("...................................................................");

break;
			case 5:
				System.out.println("ennter the sudent name for update age in record:");
				String name3=sc.next();
				System.out.println("ennter the student age:");
				int age1=sc.nextInt();
				int count3=0;
				for( i=0;i<al.size();i++);{
					if(al.get(count3).getName().contains(name3)) {
						//System.out.Studentprintln("student record:"+(search));
						System.out.println("student record:"+(i+1));
						System.out.println("enter the age you want to update");
al.get(i).setAge(age1);
//student s1=al.get(f);
//s1.setAge(age);
//al.set(f, s1);
count3++;
					}
				}
if(count3==0)
{
	
System.out.println("record not found ");
}
else {
	System.out.println("update age operation successfully");

}
System.out.println("...................................................................");
break;
case 6:
	for(student stud:al) {
		System.out.println("student"+stud+"");

	

		}
			Collections.sort(al,new SortByNames());
			System.out.println("sorted by names:\n"+al);
			System.out.println("...................................................................");


			break;
case 7:
	System.exit(0);
	break;
	default:
		System.out.println("invalid input");

		}
	}

}
	
}

