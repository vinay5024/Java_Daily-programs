package Batch71;

import java.util.Scanner;

public class Food {
	
	static int bil(int price,int quant,int dis,boolean ismember){
		int p1 = 0,f1;
		if(dis<5) {
			p1=price*quant+30;
		}
		else if(dis<10) {
			p1=price*quant+60;
		}
		else if(dis>=10) {
			p1=price*quant+100;
		}
		
		if(ismember) {
		f1=p1-(p1*15)/100;
		}
		else {
			f1=p1;
		}
		return f1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Item Price : ");
		int price=sc.nextInt();
		
		System.out.println("Item Quantity : ");
		int quant=sc.nextInt();
		
		System.out.println("Distance : ");
		int dis=sc.nextInt();
		
		System.out.println("Is_Member(true / false) : ");
		boolean ismember=sc.nextBoolean();
		
		int tbil=bil(price,quant,dis,ismember);
		System.out.println("Total bill : "+tbil);
		

	}

}
