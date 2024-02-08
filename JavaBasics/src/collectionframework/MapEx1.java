package collectionframework;
import java.util.*;
public class MapEx1 
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Vedant");
		map.put(2, "Jishaan");
		map.put(3, "Sahil");
		map.put(4, "Sameer");
		map.put(5, "Piyush");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
