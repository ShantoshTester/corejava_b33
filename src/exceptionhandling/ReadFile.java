package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		
		File file = new File("./src/exceptionhandling/sample.txt");
		FileInputStream fis = new FileInputStream(file);
		fis.close();

	}

}
