package Batch71;

public class fibrange {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<50;i++) {
			
			int c=a+b;
			if(c<50) {
			System.out.print(c+" ");
			a=b;
			b=c;
			}
		}

	}

}
