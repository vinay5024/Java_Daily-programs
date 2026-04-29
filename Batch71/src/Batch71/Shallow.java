package Batch71;

class vahicle implements Cloneable {
	String brand;
	int price;
	Car23 car;

	vahicle(String brand, int price, Car23 car) {
		this.brand = brand;
		this.price = price;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class Car23 {
	String city;

	Car23(String city) {
		this.city = city;
	}

}

public class Shallow {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car23 c = new Car23("Nellore");
		vahicle v1 = new vahicle("Lambo", 2456778, c);
		vahicle v2 = (vahicle) v1.clone();
		vahicle v3 = (vahicle) v1.clone();

		
		System.out.println(v1.car.city);
		System.out.println(v2.car.city);
		System.out.println(v3.brand);

		v2.car.city = "hyderbad";
		v3.brand="ferari";
		System.out.println(v1.car.city);
		System.out.println(v2.brand);
		System.out.println(v3.brand);
	}

}
