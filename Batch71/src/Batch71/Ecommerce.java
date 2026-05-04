package Batch71;

import java.util.Scanner;

public class Ecommerce {
  static int itemscount=0;
  static int amount=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
        
		System.out.println("Enter object " + (i) + " category : ");
		String item_1category = sc.nextLine();
		System.out.println("Enter object " + (i) + " Price : ");
		int item_1price = sc.nextInt();
		System.out.println("Enter object " + (i) + " quantity : ");
		int item_1quantity = sc.nextInt();
		Calbill(item_1category,item_1price,item_1quantity);
		
		System.out.println("Enter object " + (++i) + " category : ");
		sc.next();
		String item_2category = sc.nextLine();
		System.out.println("Enter object " + (i) + " Price : ");
		int item_2price = sc.nextInt();
		System.out.println("Enter object " + (i) + " quantity : ");
		int item_2quantity = sc.nextInt();
		Calbill(item_2category,item_2price,item_2quantity);
		
		System.out.println("Enter object " + (++i) + " category : ");
		sc.next();
		String item_3category = sc.nextLine();
		System.out.println("Enter object " + (i) + " Price : ");
		int item_3price = sc.nextInt();
		System.out.println("Enter object " + (i) + " quantity : ");
		int item_3quantity = sc.nextInt();
		Calbill(item_3category,item_3price,item_3quantity);
		
		System.out.println("Items added in cart : "+itemscount);
		if(itemscount>=5) {
			amount-=500;
			System.out.println("yahoo! you got 500 Flat discout!");
		}
		System.out.println("Your final bill : "+amount);
		
		

	}

	 static void Calbill(String category, int price, int quantity) {
		int temp=price*quantity;
		if(category.equals("Electronics")) {
			temp*=0.9;
		}
		else if(category.equals("Clothing")) {
			temp*=0.8;
		}
		amount+=temp;
		itemscount+=quantity;
		
		
	}

	 

}
