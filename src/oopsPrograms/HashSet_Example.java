package oopsPrograms;


import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example
{
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		//to add element in HashSet
		hs.add("abc");
		hs.add("xyz");
		hs.add("pqr");
			
		//calculate size 
		System.out.println("size - "+hs.size());
			
		//trying to add duplicate record
		hs.add("pqr");
		System.out.println(hs);

		//remove(Object) :- used to remove any element from set
		System.out.println("removing element -" +hs.remove("pqr"));
		System.out.println(hs);
			
		//removeAll(set object) :- used to remove all elements from set
//		hs.removeAll(hs);
//		System.out.println("Elements removed successfully");
//		System.out.println(hs);
				
		//isEmpty() :- used to check HashSet is empty or not
		System.out.println("Empty - "+hs.isEmpty());
		
		
		//Iterator interface to traverse through HashSet
		//iterator() method will iterate through each object of the set.
	
		Iterator<String> it= hs.iterator();
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		next() :- will point to the value at 0th index
		
//		hasNext() :- it will check whether next index is present or not 
//		(before pointing to next index).
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}