package collectionfarmework;

class phone12{
	int price;
	String brand;
	String model;
	public phone12(int price, String brand, String model) {
		super();
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	
	public String toString() {
		return this.brand+ " "+this.model+ " "+this.price;
		
	}
}
class sortByte implements Comparable<phone12p>{

	@Override
	public int compareTo(phone12p o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

