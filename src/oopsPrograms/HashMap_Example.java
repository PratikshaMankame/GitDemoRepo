package oopsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Example 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();

		//put(key,value) :- it is predefined method of HashMap. Used to add value in Map.
		hm.put(1, "Data_1");
		hm.put(2, "Data_2");
		hm.put(3, "Data_3");

		//get(Object key) :- used to get value of specified index.
		//		System.out.println(hm.get(2));

		//remove(Object key):- used to remove value of specified index.
		hm.remove(3);
		System.out.println("Element removed");
		System.out.println(hm.get(3));

		//entrySet() :- predefined method of Map interface. Its return type is Set.
		//used to make all key-value pairs as a Set.
		Set s=hm.entrySet();

		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}