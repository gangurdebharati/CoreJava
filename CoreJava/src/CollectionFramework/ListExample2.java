package CollectionFramework;

import java.util.*;

public class ListExample2 {

	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		
		list.add("Hardware&Networking");
		list.add("Tally");
		list.add("MS Office");
		list.add("UI/UX");
		list.add("Web Designing");
		
		System.out.println("Returning elements :"+list.get(1));
		
		list.set(1, "SAP");
		
		for(String course:list)
		{
			System.out.println(course);
		}
	}

}
