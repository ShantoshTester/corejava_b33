package exceptionhandling;

public class Program3 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		
		System.out.println("Line 01");
		System.out.println("Line 02");
		System.out.println("Line 03");
		System.out.println("Line 04");
		System.out.println("Line 05");
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Line 06");
		System.out.println("Line 07");
		System.out.println("Line 08");
		System.out.println("Line 09");
		System.out.println("Line 10");

		System.out.println("Program Ends");
	}

}
