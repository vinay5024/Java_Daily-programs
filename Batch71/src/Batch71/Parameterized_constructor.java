package Batch71;

public class Parameterized_constructor {
	int id;
	String name;
	
	Parameterized_constructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void Display() {
		System.out.println("ID = "+ id);
		System.out.println("NAME = "+ name);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameterized_constructor c = new Parameterized_constructor(92,"VINAY");
		c.Display();

	}

}
