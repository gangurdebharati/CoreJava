package collectionframework;
import java.util.*;
public class LinkedHashMapEx1 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		
		hm.put(101, "Tom");
		hm.put(102, "Jerry");
		hm.put(103, "John");
		hm.put(104, "Mike");
		
		System.out.println("Keys:"+hm.keySet());
		System.out.println("Values:"+hm.values());
		System.out.println("Key-value pairs:"+hm.entrySet());
	}

}
