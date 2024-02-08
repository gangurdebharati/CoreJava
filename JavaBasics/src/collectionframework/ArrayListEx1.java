package collectionframework;

import java.util.*;

public class ArrayListEx1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sahil");
		list.add("Jishaan");
		list.add("Jay");
		list.add("Sameer");
		list.add("Vedant");
		
		//System.out.println(list); Way 1
		
		/* Way 2
		 * Iterator itr=list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
