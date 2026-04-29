package Batch71;

public class std1 {
	String name;
	String membership;
	
	 std1() {
		this("vinay","guest");
	}
	 std1(String name){
		 this(name,"registed");
	 }
     std1(String name,String membership){
		 this.name=name;
		 this.membership=membership;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		std1 s = new std1();
		s.display();
 
	}

	 void display() {
		System.out.println("Name : "+name);
		System.out.println("Membership : "+membership);
	}
}
