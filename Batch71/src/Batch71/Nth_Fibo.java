package Batch71;

import java.util.Scanner;

public class Nth_Fibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth fibonaci number you want...?");	
		int n=sc.nextInt();		
		int a=0;
		int b=1;
		
		for(int i=1;i<n;i++) {
			int c=a+b;
			if(i==n-2) {
				System.out.println(c);
			}
			a=b;
			b=c;
		}

	}

}
