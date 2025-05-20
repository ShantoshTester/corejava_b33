package constructors;

public class EmployeeC {

	String empName;
	int empId;
	String empDept;
	boolean isEmpActive;
	double empExp;
	
	public EmployeeC()
	{
		System.out.println("Empty Constructor");
	}
	
	public EmployeeC(String eName, int eId)
	{
		this.empName = eName;
		this.empId = eId;
		System.out.println("Details of an Employee");
		System.out.println(empName + " " + empId);
	}

	public EmployeeC(String eName, int empId, String eDept, boolean isEmpActive, double empExp) {
		this.empName = eName;
		this.empId = empId;
		this.empDept = eDept;
		this.isEmpActive = isEmpActive;
		this.empExp = empExp;
		System.out.println("Details of an Employee");
		System.out.println(empName + " " + empId + " " + empDept + " " + isEmpActive + " " + empExp);
		System.out.println("********************************");
	}

	public static void main(String[] args) 
	{
		EmployeeC e1 = new EmployeeC("Daniel", 2001, "Marketing", true, 7.5);
		EmployeeC e2 = new EmployeeC("Shantosh", 2022, "Trainer", true, 13.5);
		
		EmployeeC e3 = new EmployeeC("Arun", 2015);
		
		EmployeeC e4 = new EmployeeC();
		e4.empName = "Alka";
		System.out.println(e4.empName);
	}

}
