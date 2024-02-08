package collectionframework;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) 
	{
       TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		
		hm.put(101, "Tom");
		hm.put(102, "Jerry");
		hm.put(103, "John");
		hm.put(104, "Mike");
		
		System.out.println("Before invoking remove() method :");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(103);
		System.out.println("After invoking remove() method :");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
