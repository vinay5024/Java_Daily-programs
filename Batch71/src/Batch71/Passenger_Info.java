package Batch71;

public class Passenger_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger p = new Passenger();
		p.setContact(7337430852l);
		System.out.println(p.getContact());
		p.setEmail("vinay5880@gmail.com");
		System.out.println(p.getEmail());
		p.setName("Vinay");
		System.out.println(p.getName());
		System.out.println(p.getPassport_num());
		
		System.out.println("*******************");
		Passenger p1 = new Passenger();
		p1.setContact(9724343051l);
		System.out.println(p.getContact());
		p1.setEmail("Vijay123@gmail.com");
		System.out.println(p.getEmail());
		p1.setName("Vijay Devarkonda");
		System.out.println(p.getName());
		System.out.println(p.getPassport_num());

	}

}
