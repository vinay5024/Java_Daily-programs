package Batch71;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		int evencount=0;
		int oddcount =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Range : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Oddcount : "+oddcount);
		System.out.println("evencount : "+evencount);
		

	}

}
