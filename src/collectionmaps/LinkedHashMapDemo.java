package collectionmaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		// put() to add the object to the collection
		map.put(404, "Page Not Found");
		map.put(500, "Internal Server Error");
		map.put(401, "Unauthorized");
		map.put(200, "OK");
		map.put(201, "Creared");
		map.put(100, "Continue");
		map.put(300, "Mutiple Choices");
		map.put(404, "Page Not Found");
		map.put(404, "Page Not Found");
		map.put(404, "Page Not Found");
		
		// size()
		System.out.println(map.size());
		
		// retrival of objects from map
		System.out.println(map.get(404));
		System.out.println(map.get(200));
		System.out.println(map.get(301));
		
		System.out.println(map);

	}

}
