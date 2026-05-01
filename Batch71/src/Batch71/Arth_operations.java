package Batch71;

public class Arth_operations {
	static int Addition(int a,int b) {
		return a+b;
	}
	
	static int subtraction(int a,int b) {
		return a-b;
	}
	static int multiplication(int a,int b) {
		return a*b;	
		}
	static int Division(int a,int b) {
		return a/b;
	}
	static int Remender(int a,int b) {
		return a%b;
	}
	

	public static void main(String[] args) {
		System.out.println("Addition : "+Addition(1,5));
		System.out.println("subtraction : "+subtraction(7, 4));
		System.out.println("multiplication : "+multiplication(2, 8));
		System.out.println("Division : "+Division(24, 2));
		System.out.println("Remender : "+Remender(78, 2));
			
		

	}

}
