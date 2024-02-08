package collectionframework;

import java.util.*;

public class ArrayListEx2 
{
	public static void main(String[] args) 
	{
        ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sahil");
		list.add("Jishaan");
		list.add("Jay");
		list.add("Sameer");
		list.add("Vedant");
		
		System.out.println("Returning Elements:"+list.get(1));
		
		list.set(1, "Piyush");
		
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
