package Batch71;

public class Student1 {
int id;
String name;
int fee;

public Student1() {
	this(0,"vinay");
	System.out.println("no arg constructor");
	
}
Student1(int id,String name){
	this(id,name,27000);
	this.id=id;
	this.name=name;
	
}
Student1(int id,String name,int fee){
	this.id=id;
	this.name=name;
	this.fee=fee;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.display();

	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("id : "+id);
		System.out.println("fee : "+fee);

		

	
	}

}
