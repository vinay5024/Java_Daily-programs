package Batch71;

import java.util.Scanner;

public class FactRec {
	
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n* fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");		
		int n=sc.nextInt();
		int num=fact(n);
		
		System.out.println(num);
		
		

	}

}
