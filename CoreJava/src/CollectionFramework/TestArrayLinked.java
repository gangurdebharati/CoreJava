package CollectionFramework;

import java.util.*;

public class TestArrayLinked 
{
	public static void main(String[]args)
	{
		List<String> al=new ArrayList<String>();
		
		al.add("Tom");
		al.add("Jerry");
		al.add("Micky");
		al.add("John");
		
		
		
		List<String> l=new LinkedList<String>();
		
		l.add("Divya");
		l.add("Durga");
		l.add("Roshni");
		l.add("Bhavani");
		
		
	
		
		System.out.println("ArrayList :"+al);
		System.out.println("LinkedList :"+l);
	}

}
