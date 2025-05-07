package arraysdemo;

public class ArrayProgram1 {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		
		num[0] = 30; // lower bound in array
		num[1] = 15;
		num[2] = 45;
		num[3] = 60;
		num[4] = 75; // size -1 is called upper bound in array
		
		// length method from the array class returns you the size of the array
		int size = num.length;
		System.out.println("size of the given array : "+size);
		
		System.out.println("*********** retriving the value from array ************");
		System.out.println(num[2]);
		System.out.println(num[4]);
//		System.out.println(num[5]); --> this will result in ArrayIndexOutOfBound exception
		
		System.out.println("******** printing all the values using loop *************");
		
		for(int i=0; i<size; i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("=======================================================================");
		
		String bike[] = new String[10];
		bike[0] = "Honda"; // lower bound
		bike[1] = "Harley Davidson";
		bike[2] = "BMW";
		bike[3] = "Yamaha";
		bike[4] = "Suzuki";
		bike[5] = "Bajaj";
		bike[6] = "Jawa";
		bike[7] = "Royal Enfield";
		bike[8] = "Pulsar";
		bike[9] = "Kawasaki"; // size -1 is called upper bound
		
		System.out.println("*********** printing all bike names *****************");
		
		for (String bikenames : bike) {
			System.out.println(bikenames);
		}
		
		
		
	}

}
