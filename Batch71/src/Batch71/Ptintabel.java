package Batch71;

public class Ptintabel {
	
	static void add1(int a, int b) {
		System.out.println("Integer values are : "+a+" "+b);
	}
    static void add2(double d, double e) {
    	System.out.println("Double values are : "+d+" "+e);
		
	}
    static void add3(float a, float b) {
    	System.out.println("float values are : "+a+" "+b);
	}
    static void add4(String a) {
    	System.out.println("String values is : "+a);
    }
    
    static void show() {
    	add1(10,20);
		add2(2.0,2.0);
		add3(2.9f,2.9f);
		add4("vinay");
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		
		
		
	}

}
