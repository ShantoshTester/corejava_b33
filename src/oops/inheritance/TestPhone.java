package oops.inheritance;

public class TestPhone {

	public static void main(String[] args) {
		
		Iphone iPhone = new Iphone();
		iPhone.makeCall();
		iPhone.receiveCall();
		
		System.out.println("***************************************");
		
		// here the object refered by its own type --> compile time polymorphism
		IPhone6 iPhone6 = new IPhone6();
		iPhone6.makeCall();
		iPhone6.receiveCall();
		iPhone6.sendText();
		iPhone6.receiveText();
		iPhone6.camera();
		
		System.out.println("****************************************");
		
		IPhone6 iPhone7 =new IPhone7();
		iPhone7.camera();
		
		// here the object refered by its parent type --> run time polymorphism
		Iphone iPhone1 = new IPhone6();
		iPhone1.makeCall();
		iPhone1.receiveCall();

		
		System.out.println("****************************************");
	}

}
