package Batch71;

public class Sum_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		
		for(int i=0;i<=30;i++) {
			if(i%2==0) {
				evensum+=i;			
			}
		}
		
		System.out.println("Even sum : "+evensum);

	}

}
