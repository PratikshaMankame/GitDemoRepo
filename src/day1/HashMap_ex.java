package day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_ex {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	//put(key,value) :- it is predefined method of HashMap. Used to add value in Map.
	hm.put(1, "value1");
	hm.put(2, "value2");
	hm.put(3, "value3");
	
	//get(Object key) :- used to get value of specified index.
	System.out.println(hm.get(2));
	
	//remove(Object key) :- used to remove value of specified index.
	hm.remove(3);
	
	//this each key and value is stored as a set index. when we are saying entrySet() means we are saying make all these key-value pair as a set.
	//hence return type of entrySet() is Set
	
	Set sm= hm.entrySet();
	Iterator<String> i= sm.iterator();
	
	while (i.hasNext()) 
	{
		
	}
}
}
