package methods;

public class Calculator {
	
	public static void calDiv(int num1, int num2)
	{
		int res = num1 / num2;
		System.out.println("Div of given numbers : "+res);
	}
	
	public static void calMul(int num1, int num2)
	{
		int res = num1 * num2;
		System.out.println("Mul of given numbers : "+res);
	}
	
	public static void calSum(int num1, int num2)
	{
		int res = num1 + num2;
		System.out.println("Sum of given numbers : "+res);
	}
	
	public static void calSum(int num1, int num2, int num3)
	{
		int res = num1 + num2 + num3;
		System.out.println("Sum of given numbers : "+res);
	}
	
	public static void calSum(int num1, double num2)
	{
		double res = num1 + num2;
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
		Calculator.calMul(100, 100);
		Calculator.calDiv(100, 50);
		
		System.out.println("****************************");
		Calculator.calSum(10, 50, 50);
		
		
	}
	
	

}
