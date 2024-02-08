package collectionframework;

import java.util.*;

public class ArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Priyanka");
		list.add("Radha");
		list.add("Mohit");
		
		//System.out.println(list);way 1
		
		/*way 1
		 * Iterator itr=list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		for(String s:list)
		{
			System.out.println(s);
		}
		

	}

}
