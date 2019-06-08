package com.lti.training.day6.collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleOnMap {

		public static void main(String[] args) {
			Map<String , String> map1 = new HashMap<String, String>();
			map1.put("192.168.1.1", "majrul");   				//Type of collection where data stored in the form of a map
			map1.put("192.168.1.5", "dinesh");
			map1.put("192.168.1.2", "gaurav");
			map1.put("192.168.1.3", "santosh");
			
			String user = map1.get("192.168.1.5");  
			System.out.println(user);
			
		}
}
