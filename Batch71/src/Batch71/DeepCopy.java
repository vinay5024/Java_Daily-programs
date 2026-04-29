package Batch71;

class student24{
	int sid;
	String sname;
	Adress adr;
	
	student24(int sid,String sname,Adress adr){
		this.sid=sid;
		this.sname=sname;
		this.adr= new Adress(adr.city);
	}
	
	
}
class Adress{
	
	String city;
	Adress(String city){
		this.city=city;
	}
}

public class DeepCopy {

	public static void main(String[] args) {
		Adress a= new Adress("Nellore");
		student24 s =new student24(24, "Vinay", a);
		student24 s1 =new student24(24, "Vinay", a);
		
		s1.adr.city="hyderbad";
		System.out.println(s.adr.city);
		System.out.println(s1.adr.city);

		
		

	}

}
