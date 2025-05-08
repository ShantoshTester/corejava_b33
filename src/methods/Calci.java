package methods;

public class Calci {

	public static void main(String[] args) 
	{
		Calci cal = new Calci();
		int res = cal.calSum(20, 30);
		System.out.println(res);
		
		String title = cal.getPageTitle();
		System.out.println(title);

	}
	
	public String getPageTitle()
	{
		String str = "Hello Shantosh Java";
		return str;
	}
	
	public double calSum(double num1, int num2)
	{
		double sum = num1 + num2;
		return sum;
	}
	
	public int calSum(int num1, int num2)
	{
		int res = num1 + num2;
		return res;
	}

}
