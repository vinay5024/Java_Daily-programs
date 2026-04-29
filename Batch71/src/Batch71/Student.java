package Batch71;

public class Student {

	int roll;
	String name;
	String email;
	String adress;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.name="Vinay";
		s1.roll=90;
		s1.email="vinay@gmail.com";
		s1.adress="vcube,kbhp,hyderbad-524709";
		show(s1.roll,s1.name,s1.email,s1.adress);
		
		Student s2= new Student();
		s2.name="Vijay";
		s2.roll=91;
		s2.email="vijay@gmail.com";
		s2.adress="vcube,kbhp,hyderbad-524709";
		show(s2.roll,s2.name,s2.email,s2.adress);
		
		Student s3= new Student();
		s3.name="jay";
		s3.roll=92;
		s3.email="jay@gmail.com";
		s3.adress="vcube,kbhp,hyderbad-524709";
		show(s3.roll,s3.name,s3.email,s3.adress);
		
		
	}
	
	public static void show(int roll,String name,String email,String adress) {
		
		System.out.println("*****Student Info*****");
		System.out.println();
		System.out.println("Student_Name : "+name);
		System.out.println("Student_roll : "+roll);
		System.out.println("Student_email : "+email);
		System.out.println("Student_adress : "+adress);
		
	}

}
