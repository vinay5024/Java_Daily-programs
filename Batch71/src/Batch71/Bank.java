package Batch71;

public class Bank {
	int ac_no;
	String h_name;
	int balance;
	
	static String branch="Karimnagar";
	static String bank_name="SBI";
	public static void main(String[] args) {
		Bank b= new Bank();
		b.ac_no=58680;
		b.h_name="Vinay kumar";
		b.balance=197968;
		System.out.println("Account Number: "+b.ac_no);
		System.out.println("Account Holder Name: "+b.h_name);
		System.out.println("Account Balance: "+b.balance);
		System.out.println("Branch: "+branch);
		System.out.println("Bank Name: "+bank_name);
		
		System.out.println("----------------");
		
		
		b.ac_no=68680;
		b.h_name="Ramu";
		b.balance=897968;
		System.out.println("Account Number: "+b.ac_no);
		System.out.println("Account Holder Name: "+b.h_name);
		System.out.println("Account Balance: "+b.balance);
		System.out.println("Branch: "+branch);
		System.out.println("Bank Name: "+bank_name);
		
System.out.println("----------------");
		
		
		b.ac_no=18680;
		b.h_name="venu";
		b.balance=97968;
		System.out.println("Account Number: "+b.ac_no);
		System.out.println("Account Holder Name: "+b.h_name);
		System.out.println("Account Balance: "+b.balance);
		System.out.println("Branch: "+branch);
		System.out.println("Bank Name: "+bank_name);
		
		



		
	}

}
