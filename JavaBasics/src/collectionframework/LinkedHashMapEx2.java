package collectionframework;
import java.util.*;
public class LinkedHashMapEx2 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> hm=new LinkedHashMap<Integer,String>();
		
		hm.put(101, "Tom");
		hm.put(102, "Jerry");
		hm.put(103, "John");
		hm.put(104, "Mike");
		
		System.out.println("Before invoking remove() method :"+hm);
		hm.remove(102);
		System.out.println("After invoking remove() method :"+hm);
		

	}

}
