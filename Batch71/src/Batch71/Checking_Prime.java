package Batch71;

import java.util.Scanner;

public class Checking_Prime {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		boolean ch=true;
		
		while(ch) {
			
			if( checkprime(a)) { 
				break;
			}
				System.out.println("Enter a values as prime: ");
				a=sc.nextInt();	
			
		}
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		while(ch) {
			if(checkprime(b)) {
				break;
			}
			System.out.println("Enter b values as prime: ");
			b=sc.nextInt();
		}
		
		int sum=a+b;
		if(checkprime(sum)) {
			System.out.println("sum is prime");
		}
		else {
			System.out.println("Sum is not prime");
		}
		
		

	}
	

	static boolean checkprime(int a) {
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

}
