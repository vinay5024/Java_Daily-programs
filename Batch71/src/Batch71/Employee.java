package Batch71;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pf,gst,da;
		
		String emp_name="VINAY";
		int emp_id=90;
		int salary=800000;
		
		pf=salary*0.03;
		gst=salary*0.07;
		da=salary*0.05;
		
		double msal=salary+da-gst-pf;
		System.out.println("********Employee Info******");
		System.out.println("Employee name="+emp_name);
		System.out.println("Employee Id="+emp_id);
		System.out.println("salary="+salary);
		System.out.println("pf="+pf);
		System.out.println("da="+da);
		System.out.println("gst="+gst);
		System.out.println("monthly salary="+msal);
		System.out.println("anuall salary="+msal*12);
		
		
	}

}
