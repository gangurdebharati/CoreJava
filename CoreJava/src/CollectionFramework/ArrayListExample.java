package CollectionFramework;

import java.util.*;

public class ArrayListExample
{
	public static void main(String[]args)
	{
		ArrayList<String> list=new ArrayList<String>();//creating arraylist
		
		list.add("Jawa");
		list.add("Avenger");
		list.add("KTM");
		list.add("YEZDI");
		list.add("BMW");
		
		for(String i:list)
		{
			System.out.println(i);
		}
	}

}
