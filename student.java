package collectionfarmework;

public class student {

		
		public static Object getName;
		int age;
		 String name, city;
		public int getAge() {
			
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		} 
		
		public String toString() {
			return "student[studentage="+age+", studentname="+name+",studentcity="+city+"]";
			
			
		}

	}


