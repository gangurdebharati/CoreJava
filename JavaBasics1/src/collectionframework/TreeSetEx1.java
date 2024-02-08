package collectionframework;
import java.util.*;
public class TreeSetEx1
{
	public static void main(String[] args) 
	{
		SortedSet<String> s=new TreeSet<String>();
		s.add("Audi");
		s.add("BMW");
		s.add("Baleno");
		s.add("Volvo");
		s.add("Mercedes");
		
		System.out.println("The list of elements is given as:");
		
		for(String str:s)
		{
			System.out.println(str);
		}
		System.out.println("The first elemts is given as:"+s.first());
		System.out.println("The last elemts is given as:"+s.last());
		System.out.println("The respective elements is given as:"+s.headSet("Volvo"));
		System.out.println("The respective elements is given as:"+s.tailSet("Audi"));
	}

}
