package Batch71;

public class Methods {
	
 
	void method1(){
		System.out.println("method1 called");
		method2();
	}
	
	static void method2() {
		System.out.println("method2 called");
		
	}
	void method3(){
		System.out.println("method3 called");
		

	}
	
	static void method4() {
		System.out.println("method4 called");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static {
		Methods m = new Methods();
        m.method1();
        method2();
        m.method3();
        method4();
	}
	

}
