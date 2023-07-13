package CollectionFramework;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet();
		
		set.add("BMM");
		set.add("BSC.IT");
		set.add("BSC.CS");
		set.add("BMS");
		set.add("BAF");
		set.add("BMM");
		
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
