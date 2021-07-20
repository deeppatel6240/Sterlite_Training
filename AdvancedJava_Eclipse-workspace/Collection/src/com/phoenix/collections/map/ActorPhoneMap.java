package com.phoenix.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Long> actorMap = new HashMap<String, Long>();

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
	}

}
