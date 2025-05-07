package arraysdemo;

public class ObjectDemo {

	public static void main(String[] args) {
		
		// datatype variable[] = new datatype[size];
		
		Object student[] = new Object[5];
		student[0] = "Amit";
		student[1] = 500;
		student[2] = 'M';
		student[3] = true;
		student[4] = "amit@test.com";
		
		// retrive any values -- based on index
		System.out.println(student[0]);
		System.out.println(student[4]);
//		System.out.println(student[5]);
		
		for (Object studentDetails : student) {
			System.out.println(studentDetails);
		}
		
		
		
	}

}
