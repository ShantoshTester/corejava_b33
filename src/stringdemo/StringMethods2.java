package stringdemo;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String name = "John JCenaJ";
		
		// charAt(index) : returns you the char from the given index
		System.out.println(name.charAt(0));
		
		// replace('oldchar', 'newchar'); it replaces the old char with the new char
		// replace("regex","string);
		System.out.println(name.replace('J', 'j'));
		System.out.println(name.replace("John", "abc"));
		
		String firstName = "Shantosh";
		String lastName = " Kumar";
		// appending 2 strings or joining 2 strings
		// the first approch is using + symbol
		System.out.println(firstName+lastName);
		// concat -- which is used to add 2 strings or join 2 strings
		System.out.println(firstName.concat(lastName));
		
	}

}
