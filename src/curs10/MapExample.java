package curs10;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		/*
		 * user = test
		 * {
		 *   clientId = 12345;
		 *      } 
		 */
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PO", "Product Owner");
		
		System.out.println("----------------------");
		
        System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		System.out.println("----------------------");
		
		System.out.println(map);
		
		System.out.println(map.get("PO"));
		
		System.out.println("----------------------");
		
		map.put("D", "Director");
		
		System.out.println(map);
		
		System.out.println("----------------------");
		
		for(String key : map.keySet()) {
			System.out.println(key + " | ");
		}
		
		System.out.println(map.values());
		
		System.out.println("\n----------------------");
		
		boolean checkKey = map.containsKey("T");
		System.out.println(checkKey);
		//if(map.containsKey("T")) {}
		
		boolean checkValue = map.containsValue("SRE");
		System.out.println(checkValue);
		
		System.out.println("\n----------------------");
		
		map.remove("M");
		
		System.out.println(map);
		

	}

}
