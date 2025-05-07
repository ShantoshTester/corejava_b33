package loops;

public class SumOfNumbers {
	
	// Program to print sum of first 5 natural numbers 1 to 5

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=5; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of given numbers : "+sum);

	}

}
