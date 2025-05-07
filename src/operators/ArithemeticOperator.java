package operators;

public class ArithemeticOperator 
{
	public static void main(String[] args) 
	{
		int num1 = 20;
		int num2 = 10;
		int num3 = 9;
		double num4 = 2.5;
		
		int sum = num1 + num2;
		System.out.println("sum of given numbers : "+sum);
		
		int sub = num1 - num2;
		System.out.println("sub of given numbers : "+sub);
		
		int mul = num1 * num2;
		System.out.println("mul of given numbers : "+mul);
		
		int div = num1 / num2;
		System.out.println("div of given numbers : "+div);
		
		int mod = num1 % num3;
		System.out.println("mod of given numbers : "+mod);
		System.out.println("mod of given numbers : "+num3 % num4);
		
		String firstName = "John";
		String lastName = "Jacob";
		String fullName = firstName + lastName;
		System.out.println("appended firstname with lastname "+fullName);

	}

}
