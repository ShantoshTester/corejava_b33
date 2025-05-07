package selection;

public class FindGrade {

	public static void main(String[] args) {
		
		int science = 50;
		int maths = 60;
		int social = 50;
		int total;
		int percentage;
		total = science + maths + social;
		percentage = (total*100)/300;
		System.out.println(percentage);
		
		if(percentage >=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage >= 65)
		{
			System.out.println("Grade B");
		}
		else if(percentage >=35)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
