package collectionlistdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> al = new LinkedList<String>();
		al.add("java");
		al.add("selenium");
		al.add("rest-assured");
		al.add("sql");
		al.add("playwright");
		al.add("java");
		al.add("javascript");
		al.add("java");
		
		al.add(0, "uft");
		
		System.out.println(al);
		
		System.out.println("************************************");
		
		CitiBank c1 = new CitiBank("Shantosh", 23656, true, 878989.36);
		CitiBank c2 = new CitiBank("Rajesh", 36969, true, 1098975.36);
		CitiBank c3 = new CitiBank("Pavithra", 75421, true, 5898989.36);
		
		List<CitiBank> alc = new LinkedList<CitiBank>();
		alc.add(c1);
		alc.add(c2);
		alc.add(c3);
		
		
		for (CitiBank custDetails : alc) {
			System.out.println(custDetails.custName+" "+custDetails.accNo
					+" "+custDetails.isActive+" "+custDetails.accBal);
		}

	}

}











