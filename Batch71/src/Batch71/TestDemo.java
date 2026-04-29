package Batch71;

class Vehicle {
	String brand;

	Vehicle() {
		brand = "Lamborgini";
		System.out.println(brand);
	}
}

class car1 extends Vehicle {
	int price;

	car1(int price) {
		super();
		this.price = price;
		System.out.println(price);
	}

}

class Electric_car extends car1 {
	int baterry;

	Electric_car(int price, int baterry) {
		super(price);
		this.baterry = baterry;
		System.out.println(baterry);
	}

}

public class TestDemo {

	public static void main(String[] args) {
		Electric_car e = new Electric_car(256878, 35000);
	}

}
