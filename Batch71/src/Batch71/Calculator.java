package Batch71;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter Secound number : ");
		int b=sc.nextInt();
		System.out.println("Enter any one operand (+,-,*,/)");
		String operand =sc.next();
		
		if(operand.equals("+")) {
			System.out.println(a+b);
		}
		else if(operand.equals("-")) {
			System.out.println(a-b);
		}
		else if(operand.equals("*")) {
			System.out.println(a*b);
		}
		else if(operand.equals("/")) {
			System.out.println(a/b);
		}

	}

}
