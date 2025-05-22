package collectionsetdemo;

import java.util.HashSet;
import java.util.Set;


public class HashSetDemo {

	public static void main(String[] args) {
		
		 Set<String> hs = new HashSet<String>();
		 // add() is the method to add the object to the collection
		 hs.add("selenium");
		 hs.add("java");
		 hs.add("page-object-model");
		 hs.add("selenium");
		 hs.add("javascript");
		 hs.add("java");
		 hs.add("cypress");
		 hs.add("github");
		 hs.add("jenkins");
		 hs.add("playwright");
		 hs.add("docker");
		 
		 // size() to get the current size of the collection
		 System.out.println("current size : "+hs.size());
		 
		 // print all the object values
		 System.out.println(hs);

	}

}
