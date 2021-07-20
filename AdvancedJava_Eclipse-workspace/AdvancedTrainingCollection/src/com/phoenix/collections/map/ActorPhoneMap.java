package com.phoenix.collections.map;

import java.util.Collections;
import java.util.Comparator;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// unordered and unsorted
		// Map<String, Long> actorMap = new HashMap<String, Long>();

		// ordered and unsorted
		//Map<String, Long> actorMap = new LinkedHashMap<String, Long>();

		// ordered and sorted
		//Map<String, Long> actorMap = new TreeMap<String, Long>();

		//Comparator<String> c = Collections.reverseOrder();
		TreeMap<String, Long> actorMap = new TreeMap<String, Long>();
		
		actorMap.put("Thomas", 1234567890L);
		actorMap.put("Tony", 2344567890L);
		actorMap.put("Chris", 6234567890L);
		actorMap.put("Grace", 5234567890L);
		actorMap.put("Demon", 7234567890L);
		actorMap.put("Stefen", 9234567890L);
		actorMap.put("Alvero", 8734567890L);
		actorMap.put("Denial", 52347567890L);

		// get value of key
		System.out.println("Phone No of Thomas: " + actorMap.get("Thomas"));

		// direct print Map
		System.out.println(actorMap);

		// using Iterator
		Set<String> actors = actorMap.keySet();
		Iterator<String> it = actors.iterator();

		while (it.hasNext()) {
			String actorName = it.next();
			long phoneNo = actorMap.get(actorName);
			System.out.println("Actor: " + actorName + "\tPhone No.: " + phoneNo);
		}
		
		NavigableMap<String, Long> nMap= actorMap.headMap("Chris", true);
		System.out.println(nMap);
		
		NavigableMap<String, Long> tMap= actorMap.tailMap("Chris", false);
		System.out.println(tMap);
		
		SortedMap<String, Long> sMap = actorMap.subMap("Denial", "Grace");
		System.out.println(sMap);
	}

}
