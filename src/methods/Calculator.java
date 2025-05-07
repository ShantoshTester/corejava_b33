package methods;

public class Calculator {
	
	public static void calSum(int num1, int num2)
	{
		int res = num1 + num2;
		System.out.println("Sum of given numbers : "+res);
	}
	
	public static void calSub(int num1, int num2)
	{
		int res = num1 - num2;
		System.out.println("Sub of given numbers : "+res);
	}
	
	
	public static void main(String[] args) {
		
		Calculator.calSum(450, 450);
		Calculator.calSum(1000, 1000);
		Calculator.calSub(5000, 2500);
		
		
	}
	
	

}
