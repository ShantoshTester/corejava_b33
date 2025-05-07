package selection;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 0;
		
		switch(x)
		{
		case 1:
			System.out.println("case 1 matched");
			break;
			
		case 2:
			System.out.println("case 2 matched");
			break;
			
		case 3:
			System.out.println("case 3 matched");
			break;
			
			default:
				System.out.println("none of the case label matched");
		}

	}

}
