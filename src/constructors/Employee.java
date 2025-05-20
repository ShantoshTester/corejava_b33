package constructors;

public class Employee {
	
	String empName;
	int empId;
	String empDept;
	boolean isEmpActive;
	double empExp;
	

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.empName = "Daniel";
		e1.empId = 2021;
		e1.empDept = "Marketing";
		e1.isEmpActive = true;
		e1.empExp = 8.5;
		System.out.println("Details of Employee E1");
		System.out.println(e1.empName+" "+e1.empId+" "+e1.empDept+" "+e1.isEmpActive+" "+e1.empExp);
		System.out.println("********************************");
		
		Employee e2 = new Employee();
		e2.empName = "Shantosh";
		e2.empDept = "Trainer";
		e2.isEmpActive = true;
		e2.empExp = 11.5;
		System.out.println("Details of Employee E2");
		System.out.println(e2.empName+" "+e2.empId+" "+e2.empDept+" "+e2.isEmpActive+" "+e2.empExp);
		System.out.println("********************************");
		

	}

}
