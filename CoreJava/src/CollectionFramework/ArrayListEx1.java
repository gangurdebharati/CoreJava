package CollectionFramework;
import java.util.*;

public class ArrayListEx1
{
	public static void main(String[]args)
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Avenger");
		list.add("KTM");
		list.add("YEZDI");
		list.add("JAWA");
		list.add("R15");
		
		System.out.println("Returning elements :"+list.get(2));
		
		list.set(1, "Royal Enfield");
		
		for(String bikes:list)
		{
			System.out.println(bikes);
		}
		
	}
	

}
