package stringdemo;

public class StringImutable {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		String n1 = " Hello World ";
		// method chaining : we can call more than one method at a time
		int len = n1.trim().length();
		System.out.println(len);
		
		String n2 = "James";
		String n3 = "james";
		
		System.out.println(n2.toLowerCase().equals(n3));
		
	}

}
