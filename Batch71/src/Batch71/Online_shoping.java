package Batch71;

import java.util.Scanner;

public class Online_shoping {
	static int order(int price,int quantity,String coupon) {
		int finalprice=0;
		int total=price*quantity;
		if(total<500) {
			total+=50;
			System.out.println(total);
		}
		
		if(coupon.equals("SAVE10")) {
			 finalprice=total-((total*10)/100);
		}
		else {
			finalprice=total;
		}
		return finalprice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price : ");
		int price=sc.nextInt();
		System.out.print("Enter quantity : ");
		int quantity=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Coupon code : ");
		String coupon=sc.nextLine();
	
		int total_Price=order(price,quantity,coupon);
		System.out.println("you bill : "+total_Price);

	}

}
