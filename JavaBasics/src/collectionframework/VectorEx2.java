package collectionframework;

import java.util.*;

public class VectorEx2
{
	public static void main(String[] args) 
	{
        Vector<String> vec=new Vector<String>();
		
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");

		System.out.println("Size is :"+vec.size());
		System.out.println("Default capacity is :"+vec.capacity());
		System.out.println("Vector elements are:"+vec);
		
		vec.addElement("Cow");
		vec.addElement("Goat");
		vec.addElement("Cat");
		
		System.out.println("Size after addition:"+vec.size());
		System.out.println("Capacity after addition is :"+vec.capacity());
		System.out.println("Element are:"+vec);
		
		if(vec.contains("Tiger")) 
		{
			System.out.println("Tiger is present at the index:"+vec.indexOf("Tiger"));
		}
		else
		{
			System.out.println("Tiger is not present inside the given list.");
		}
		System.out.println("The first animal of the vector is :"+vec.firstElement());
		System.out.println("The last animal of the vector is :"+vec.lastElement());
	}

}
