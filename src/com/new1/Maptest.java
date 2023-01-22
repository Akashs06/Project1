package com.new1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maptest {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("cs01", 85);
		map.put("cs02", 80);
		map.put("cs03", 90);
		map.put("cs04", 95);
		
		System.out.println(map);
		Integer integer = map.get("cs01");
		System.out.println(integer);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		boolean containsKey = map.containsKey("cs01");
		System.out.println(containsKey);
		
		
		
		
		
		
		
	}

}
