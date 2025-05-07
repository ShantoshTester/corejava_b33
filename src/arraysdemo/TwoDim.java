package arraysdemo;

public class TwoDim {

	public static void main(String[] args) {
		
		String s[][] = new String[4][3];
		
		s[0][0] = "A1";
		s[0][1] = "B1";
		s[0][2] = "C1";
		
		s[1][0] = "A2";
		s[1][1] = "B2";
		s[1][2] = "C2";
		
		s[2][0] = "A3";
		s[2][1] = "B3";
		s[2][2] = "C3";
		
		s[3][0] = "A4";
		s[3][1] = "B4";
		s[3][2] = "C4";
		
		// length method : returns the size of the rows and col
		// ** col size depends on the row. we cannout directly get the col size
		System.out.println("no of row : "+s.length);
		System.out.println("no of col : "+s[0].length);
		
		// retrival values from the matrix
		System.out.println(s[0][1]);
		System.out.println(s[3][2]);
		System.out.println();
		
		System.out.println("printing all the values from the matix");
		
		
		for(int row=0; row<s.length; row++)
		{
			for(int col=0; col<s[0].length; col++)
			{
				System.out.print(s[row][col]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}



