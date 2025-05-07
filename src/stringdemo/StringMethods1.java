package stringdemo;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		// length() : returns the no of chars from the given string
		
		int size = s1.length();
		System.out.println("size of the given string : "+size);
		
		// trim() : removes the trailing and preceeding empty space from the string
		
		String s2 = " Core Java ";
		System.out.println("before trimming :"+s2);
		System.out.println("after trimming :"+s2.trim());
		
		// toUpperCase() : it converts the lower case letters to upper case
		System.out.println(s1.toUpperCase());
		
		// toLowerCase() : it converts the upper case letters to lower case
		System.out.println(s1.toLowerCase());

	}

}
