package collectionlistdemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		// add() - this method is used to add the objects to the collection
		al.add(10); // int or Integer
		al.add(20.33);
		al.add(10);
		al.add(true);
		al.add(20.33);
		al.add("Shantosh");
		al.add('m');
		al.add("sql virus");
		
		// size() - this method will return you the number of objects from the collection
		int count = al.size();
		System.out.println("Total objects in the collection : "+count);
		
		// positional adding of elements
		al.add(7, 30);
		
		// retrive the objects from the collection - based on the index
		// get(index) is the method to retrive the object from the collection
		System.out.println(al.get(0));
//		System.out.println(al.get(8));
		
		System.out.println("Printing all the objects from the collection");
		
		for(int i=0; i<count; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("Printing all the objects from the collection 2");
		
		System.out.println(al);

	}

}








