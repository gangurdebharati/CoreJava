package CollectionFramework;

import java.util.*;

public class SortArray 
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		
		list.add("Mumbai");
		list.add("Nashik");
		list.add("Hydrabad");
		list.add("Goa");
		
		Collections.sort(list);
		
		for(String city:list)
		{
			System.out.println(city);
		}
		
		System.out.println("Sorting Numbers :");
		
		List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(101);
		list1.add(204);
		list1.add(111);
		list1.add(102);
		list1.add(100);
		
		Collections.sort(list1);
		
		for(Integer number:list1)
		{
			System.out.println(number);
		}
	}

}
