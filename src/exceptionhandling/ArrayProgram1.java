package exceptionhandling;

public class ArrayProgram1 {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		
		num[0] = 30; // lower bound in array
		num[1] = 15;
		num[2] = 45;
		num[3] = 60;
		num[4] = 75; // size -1 is called upper bound in array
		
		try
		{
			System.out.println(num[6]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}

}
