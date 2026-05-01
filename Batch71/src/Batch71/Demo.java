package Batch71;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s = new SmartPhone("iqoo", 5000);
		s.ShowDetails();
		System.out.println(s.Makecall("Hello calling from smartphone"));
		Laptop l = new Laptop("Hp", 10000);
		l.ShowDetails();
		System.out.println(l.openLid("Black hinge"));

	}

}
