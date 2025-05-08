package methods;

public class CalculatorNS {
	

	public static void main(String[] args) 
	{
		CalculatorNS cal = new CalculatorNS();	
		cal.calSum(100, 100);
	}
	
	public void calDiv(int num1, int num2)
	{
		int res = num1 / num2;
		System.out.println("Div of given numbers : "+res);
	}
	
	public void calMul(int num1, int num2)
	{
		int res = num1 * num2;
		System.out.println("Mul of given numbers : "+res);
	}
	
	public void calSum(int num1, int num2)
	{
		int res = num1 + num2;
		System.out.println("Sum of given numbers : "+res);
	}
	
	public void calSub(int num1, int num2)
	{
		int res = num1 - num2;
		System.out.println("Sub of given numbers : "+res);
	}
	
	

}
