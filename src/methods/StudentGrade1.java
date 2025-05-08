package methods;

public class StudentGrade1 {

	public static void main(String[] args) 
	{
		StudentGrade1.findGrade("Shruthi", 20);
		StudentGrade1.findGrade("Pallavi", 60);
		StudentGrade1.findGrade("Dhruv", 86);
	}
	
	public static void findGrade(String sName, int score)
	{
		String grade;
		if(score >=85 & score<=100)
		{
			grade = "A";
		}
		else if(score >=60 & score<=84)
		{
			grade = "B";
		}
		else if(score >=35 & score<=59)
		{
			grade = "C";
		}
		else
		{
			grade = "FAIL";
		}
		System.out.println("Grade of the Student : "+sName+" is : "+grade);
		System.out.println();
	}

}
