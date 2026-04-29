package Batch71;
import java.util.*;
public class Food_order {
	static void orderfood(int price,int quantity,int dc, int discount){
		int total=price*quantity;
		int discount_price=total*discount/100;
		int after_discount=total-discount_price;
		System.out.println("Total bill : "+after_discount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price : ");
		int price=sc.nextInt();
		System.out.print("Enter quantity : ");
		int quantity=sc.nextInt();
		System.out.print("Dilivary Charge : ");
		int dc=sc.nextInt();
		System.out.print("Enter Discount : ");
		int discount=sc.nextInt();
		orderfood(price,quantity,dc,discount);
		
		
		

	}

}
