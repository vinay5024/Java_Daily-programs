package Batch71;

import java.util.Scanner;

public class Bill {
	static int cal(int u) {
		int total;
		if(u<=100) {
			total= u*5;
		}
		else if(u>100 && u<=200) {
			int f1=100*5;
			int s1=(u-100)*7;
			total=f1+s1;
		}
		else {
			int f2=100*5;
			int s2=100*7;
			total=f2+s2+(u-200)*10;
		}
		
		return total;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total units : ");
		int u=sc.nextInt();
		
	    int bill=cal(u);
	    
	    
	    System.out.println("Total bill: "+bill);
		

	}

}
