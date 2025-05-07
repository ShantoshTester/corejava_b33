package variables;

public class Batch33S {
	
	String name;
	int id;
	char gender;
	static String course = "Selenium";
	
	public static void main(String[] args) 
	{
		Batch33S student1 = new Batch33S();
		student1.name = "Shantosh";
		student1.id = 10001;
		student1.gender = 'M';
		System.out.println("++++++++ Details of Student1 +++++++++");
		System.out.println(student1.name);
		System.out.println(student1.id);
		System.out.println(student1.gender);
		System.out.println(student1.course);
		System.out.println("************************************************");
		
		Batch33S student2 = new Batch33S();
		student2.name = "Shruthi";
		student2.id = 10002;
		student2.gender = 'F';
		System.out.println("++++++++ Details of Student2 +++++++++");
		System.out.println(student2.name);
		System.out.println(student2.id);
		System.out.println(student2.gender);
		System.out.println(student2.course);
		System.out.println("************************************************");
	}

}
