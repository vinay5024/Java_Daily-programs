package Batch71;

public class ForExperiments {
	static int add(int a, int b) {
		System.out.println("int method called");
		return a+b;
	}
	
	static float add(float a, float b) {
		System.out.println("float method called");
		return a+b;
	}
	static float add(int a, float b) {
		System.out.println("float 2 method called");
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(2,2.0f));
		
	}

}
