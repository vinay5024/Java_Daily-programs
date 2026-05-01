package CaseStudy;

public class JavaCaseStudy {
static int itemcount=0;
	public static void main(String[] args) {
		int ac_price=38000;
		int ac_quantity=2;
		
		paybleAmount(ac_price,ac_quantity);
		
		int shirt_price=2000;
		int shirt_quantity=5;
		
		paybleAmount(shirt_price,shirt_quantity);

		
		int tv_price=28000;
		int tv_quantity=3;
		
		paybleAmount(tv_price,tv_quantity);
		
		System.out.println("No.of items added in cart : "+itemcount);

	

	}
	static void paybleAmount(int price, int quantity) {
		
		int amount=price*quantity;
		int discount=amount/1500;
		if(discount>0) {
			amount-=discount*300;
			System.out.println("Total payble amount : "+amount);
		}
		else {
			System.out.println("Total payble amount : "+amount);
		}
		itemcount++;
		
	}

}
