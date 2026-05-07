package Batch71;

import java.util.Scanner;

public class NestedSwitchCase {

	static int total = 0;

	public static void main(String[] args) {
		
		String str1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Select the Menu :  ");
			System.out.println("Pizza Or Burger Or Drinks  ");
			String str = sc.next();

			switch (str.toLowerCase()) {

			case "pizza" -> {
				System.out.println("Select Veg or Non-veg");
				String item = sc.next();
				switch (item) {
				case "veg" -> {
					System.out.println("1.onion pizaa - 150rs");
					System.out.println("2.corn pizaa - 250rs");
					System.out.println("3.magnate pizaa - 350rs");

					System.out.println("Select : 1 or 2 or 3 ");
					int n = sc.nextInt();
					switch (n) {
					case 1 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 150;

					}
					case 2 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 250;

					}
					case 3 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 350;

					}

					default -> System.out.println("invalid case");
					}
				}
				case "non-veg" -> {
					System.out.println("1.Chicken pizaa - 150rs");
					System.out.println("2.Double pizaa - 250rs");
					System.out.println("3.Chicken magnate pizaa - 350rs");

					System.out.println("Select : 1 or 2 or 3 ");
					int n = sc.nextInt();
					switch (n) {
					case 1 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 150;

					}
					case 2 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 250;

					}
					case 3 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 350;

					}

					default -> System.out.println("invalid case");
					}
				}
				}
			}

			case "burger" -> {
				System.out.println("Select Veg or cheese");
				String item = sc.next();
				switch (item) {
				case "veg" -> {
					System.out.println("1.onion Burger - 150rs");
					System.out.println("2.corn burger - 250rs");
					System.out.println("2.magnate Burger - 350rs");
					System.out.println("Select : 1 or 2 or 3 ");
					int n = sc.nextInt();
					switch (n) {
					case 1 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 150;

					}
					case 2 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 250;

					}
					case 3 -> {
						System.out.print("Enter quantity :");
						int n1 = sc.nextInt();
						total += n1 * 350;

					}

					default -> System.out.println("invalid case");
					}

				}
				case "cheese" -> {
					System.out.println("1.Chicken Burger - 150rs");
					System.out.println("2.Double Burger - 250rs");
					System.out.println("3.Chicken magnate Burger - 350rs");

					System.out.println("Select : 1 or 2 or 3 ");
					int n = sc.nextInt();
					switch (n) {
					case 1 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 150;

					}
					case 2 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 250;

					}
					case 3 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 350;

					}

					default -> System.out.println("invalid case");
					}
				}
				}

			}

			case "drinks" -> {
				System.out.println("Select Coke or Juice");
				String item = sc.next();
				switch (item) {
				case "coke" -> {
					System.out.println("1.Big coke - 150rs");
					System.out.println("2.Medium coke - 250rs");
					System.out.println("3.Small coke - 350rs");
					System.out.println("Select : 1 or 2 or 3 ");
					int n = sc.nextInt();
					switch (n) {
					case 1 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 150;

					}
					case 2 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 250;

					}
					case 3 -> {
						System.out.print("Enter quantity");
						int n1 = sc.nextInt();
						total += n1 * 350;

					}

					default -> System.out.println("invalid case");
					}

				}
				case "juice" -> {
					System.out.println("1.Mango juice - 150rs");
					System.out.println("2.Orange juice - 250rs");
					System.out.println("3.Apple juice - 350rs");

					System.out.println("Select : 1 or 2 or 3 ");
					int n = sc.nextInt();
					switch (n) {
					case 1 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 150;

					}
					case 2 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 250;

					}
					case 3 -> {
						System.out.print("Enter quantity : ");
						int n1 = sc.nextInt();
						total += n1 * 350;

					}

					default -> System.out.println("invalid case");
					}
				}

				}

			}

			}
			System.out.println("Do you want to continue to purchase another items");
			 str1=sc.next();
			
		}
		
		while (!str1.equals("no"));
		
		System.out.println("Your total bill : "+total);

	}
}
