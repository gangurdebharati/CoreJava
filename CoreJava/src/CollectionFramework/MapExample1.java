package CollectionFramework;

import java.util.*;
import java.util.Map.Entry;

public class MapExample1 {

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Yash");
		map.put(2,"Adengill");
		map.put(3,"Jash");
		
		for(Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		

	}

}
