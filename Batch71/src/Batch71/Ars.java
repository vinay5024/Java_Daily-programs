package Batch71;

class A {
	int i = 789;

	A(int i) {
		this.i = i;
		System.out.println("class A called");
		display();
	}

	void display() {
		System.out.println(i);
	}
}

class B extends A {
	int i = 987;

	B() {
		this(100);
	}

	B(int i) {
		super(i);
	}

	void display() {
		System.out.println(i);
	}
}

public class Ars {

	public static void main(String[] args) {

		A obj = new B();
		obj.display();

	}
}