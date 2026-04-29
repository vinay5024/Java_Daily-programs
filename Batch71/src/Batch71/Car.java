package Batch71;

public class Car {
	int price=500000;
	String brand="Range Rover";
	Car(){	
		Display(price,brand);
	}
	static void Display(int price,String brand) {
		System.out.println("CAR BRAND : "+brand);
		System.out.println("CAR PRICE : "+price);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		
		

	}

}
