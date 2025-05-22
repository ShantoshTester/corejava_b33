package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile2 {

	public static void main(String[] args) {
		
		// Can a try block be followed with multiple catch blocks? YES
		
		File file = new File("./src/exceptionhandling/sample.txt");
		try
		{
			FileInputStream fis = new FileInputStream(file);
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
