package CollectionFramework;
import java.util.*;
public class TreeSet1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("Durga");
		t.add("Manisha");
		t.add("Neha");
		t.add("Shiva Teja");
		t.add("Anju");
		
		System.out.println("Traversing elements through Iterator in decending order");
		
		Iterator i=t.descendingIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		 

	}

}
