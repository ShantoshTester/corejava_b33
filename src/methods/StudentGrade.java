package methods;

public class StudentGrade {

	public static void main(String[] args) 
	{
		String studentName;
		int score;
		String grade;
		
		studentName = "Samuel";
		score = 90;
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
		System.out.println("Grade of the Student : "+studentName+" is : "+grade);
		System.out.println();
		
		studentName = "Lavanya";
		score = 95;
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
		System.out.println("Grade of the Student : "+studentName+" is : "+grade);
		System.out.println();
		
		studentName = "Shantosh";
		score = 30;
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
		System.out.println("Grade of the Student : "+studentName+" is : "+grade);
		System.out.println();
	}

}
