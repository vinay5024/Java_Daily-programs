package Batch71;

public class Methods_1 {
	
	
static void show(){//no return type no arguments
	System.out.println("METHOD_1");
}
static void show(int a) {//no return type with arguments
	System.out.println("METHOD_2 :"+a);
}
static int add(int a,int b) {//with return type with arguments
	int c=a+b;
	return c;
}
static int display() {//with return type no arguments
	int a=100;
	return a;
}
	public static void main(String[] args) {
		show();
		show(20);
		System.out.println(add(10,20));
		System.out.println(display());
		
		int a=10;
		float b =10;
		System.out.println(b);

	}

}
