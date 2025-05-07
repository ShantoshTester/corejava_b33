package stringdemo;

public class StringMethods3 {

	public static void main(String[] args) {
		
		String name = "Java Programming";
		
		// substring(index) - this method will extract the string from the given index
		System.out.println(name.substring(5));
		// substring(begin-index, last-index) - begin index is inclusive & last index is exclusive
		System.out.println(name.substring(0, 8));
		
		// contains - this method will check if the given string is present and returns the boolean as the output
		System.out.println(name.contains("Java"));
		System.out.println(name.contains("Shruthi"));
		
		String program = "I am learning learning java java programming";
		//split("regex") - this method will split the given string based on the reg exp
		String[] arr = program.split(" ");
		
		for (String words : arr) 
		{
			System.out.println(words);
		}
		
		System.out.println("****************************************************");
		
		String actual = "Welcome Google";
		String expected = "Welcome Google";
		String expected1 = "welcome Google";
		
		// equals() : used to compare 2 strings and result as boolean as output
		System.out.println(actual.equals(expected));
		// equalIgnoreCase() ***
		System.out.println(actual.equalsIgnoreCase(expected1));

	}

}










