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
		System.out.println("Deafult capacity is :"+vec.capacity());
		System.out.println("Vector elements are :"+vec);
		
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		
		System.out.println("Size after addition is :"+vec.size());
		System.out.println("Capacity after addition is :"+vec.capacity());
		System.out.println("After addition elements are :"+vec);
		
		if(vec.contains("Tiger"))
		{
			System.out.println("Tiger is present at the index :"+vec.indexOf("Tiger"));
		}
		else
		{
			System.out.println("Tiger is not present in the given vector");
		}
		
		System.out.println("This first animal of the vector is :"+vec.firstElement());
		System.out.println("This last animal of the vector is :"+vec.lastElement());
		
		
		

	}

}
