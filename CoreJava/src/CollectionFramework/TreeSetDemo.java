package CollectionFramework;
import java.util.*;
public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		t.add("E");
		
		System.out.println("Initial Set :"+t);
		
		System.out.println("Reverse Set :" +t.descendingSet());
		
		System.out.println("Head Set :"+t.headSet("C",false));
		
		System.out.println("TailSet"+t.tailSet("C", false));

	}

}
