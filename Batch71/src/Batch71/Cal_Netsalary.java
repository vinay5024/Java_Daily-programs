package Batch71;

import java.util.Scanner;

public class Cal_Netsalary {
	static int cal(int sal) {
		int da=(sal*10)/100;
		int hra=(sal*20)/100;
		
		
		int tax=(sal*5)/100;
		
		return sal+da+hra-tax;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		int final_sal=cal(salary);
		sc.close();
		System.out.println("Final Salary : "+final_sal);

	}

}
