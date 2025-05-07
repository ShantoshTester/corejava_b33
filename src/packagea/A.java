package packagea;

public class A {
	
	private int a = 10;
	int b = 20;
	public int c = 30;
	protected int d = 40;
	
	public static void main(String[] args) 
	{
		A objA = new A();
		System.out.println(objA.a);
		System.out.println(objA.b);
		System.out.println(objA.c);
		System.out.println(objA.d);
	}

}
