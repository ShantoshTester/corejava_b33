package operators;

import java.util.Scanner;

public class CalProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter Number 1 :");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		System.out.println("Enter Number 2 :");
		int n2 = scan.nextInt();
		int sum = n1+n2;
		System.out.println("Sum of entered values : "+sum);
		
	}

}
