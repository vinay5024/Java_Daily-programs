package Batch71;

import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range : ");
		int a=sc.nextInt();
		System.out.println("Enter ending range : ");
		int b=sc.nextInt();
		int i,j,count=0;
		for( i=a;i<=b;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println(i);
				count=count+i;
			}
		}
		System.out.println("Sum : "+count);


	}

}
