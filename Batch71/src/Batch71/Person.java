package Batch71;

public class Person {
	String name ;
	int age;
	
	
	Person(int a,String n){
		name=n;
		age=a
				;
	}

	public static void main(String[] args) {
		
		Person p = new Person(22,"Vinay");
		System.out.println(p.name);
		System.out.println(p.age);

	}

}
