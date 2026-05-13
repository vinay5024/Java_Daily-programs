package Batch71;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		int num=iseven(n);
		
		if(num==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Not Even Number");
		}

	}

	static int iseven(int n) {
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
	
		return iseven(n-2);
	}

	
	}


