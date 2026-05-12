package Batch71;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number for Table : ");
		int n=sc.nextInt();//8
		System.out.println("Enter a Range : ");
		int m=sc.nextInt();//10 - 20
		
		for(int i=1;i<=m;i++) {
			System.out.println(n+"x"+i+"="+ n*i);
		}
		

	}

}
