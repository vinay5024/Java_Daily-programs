package Batch71;

import java.util.Scanner;

public class Login_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name : ");
		String name=sc.nextLine();
		System.out.println("Enter password : ");
		String pwd=sc.next();
		
		if( name.equals("user")&& pwd.equals("1234") ) {
			System.out.println("Login sucessfull");
		}
		else {
			System.out.println("invalid login");
		}
		
		
		

	}

}
