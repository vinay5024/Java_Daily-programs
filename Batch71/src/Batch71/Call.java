package Batch71;

public class Call {
	void videocall() {
		System.out.println("video call started");
	}
	void audiocall() {
		System.out.println("voice call stated");
	}
}

//-----------------------------------
class updates{
	void status() {
		System.out.println("seee your friends and family status");
	}
	void channels() {
		System.out.println("get channels content");
	}
}

//---------------------------------------
class Whatsapp{
	public static void main(String []args) {
	Call obj = new Call();
	updates obj1= new updates();
	obj.audiocall();
	obj.videocall();
	
	obj1.channels();
	obj1.status();
	}
}