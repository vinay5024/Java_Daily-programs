package Batch71;

public class Device {

	String brand;
	int power;
	
	
	Device(String brand,int power){
		this.brand=brand;
		this.power=power;
		
	}
	
    void ShowDetails() {
    	System.out.println(brand);
    	System.out.println(power);
		
	}

}
