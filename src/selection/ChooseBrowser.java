package selection;

public class ChooseBrowser 
{
	public static void main(String[] args) 
	{
		String browser = "ie";
		
		switch(browser)
		{
		case "edge":
			System.out.println("Using Edge Browser for Execution");
			break;
			
		case "chrome":
			System.out.println("Using Chrome Browser for Execution");
			break;
			
		case "Firefox":
			System.out.println("Using Firefox Browser for Execution");
			break;
			
			default:
				System.out.println("This browser is Unsupported");
		}

	}

}
