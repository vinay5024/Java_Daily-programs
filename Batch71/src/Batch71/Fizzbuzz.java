package Batch71;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		if( num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}
		else if(num%5==0 && num%3!=0) {
			System.out.println("Buzz");
		}
		else if(num%3==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println(num);
		}

	}

}
