package CollectionFramework;

import java.util.*;

public class ListItrExample {

		public static void main(String[] args) 
		{
			List<String> list=new ArrayList<String>();
			
			list.add("Sai");
			list.add("Bhavani");
			list.add("Narmsinha");
			list.add("Divya");
			list.add(1,"Durga");
			
			ListIterator<String> itr=list.listIterator();
			
			System.out.println("Traversing elements in forword direction");
			
			while(itr.hasNext())
			{
				System.out.println("index"+itr.nextIndex()+"Value :"+itr.next());
			}
			System.out.println("Traversing elements in backward direction");
			
			while(itr.hasPrevious())
			{
				System.out.println("index"+itr.previousIndex()+"Value :"+itr.previous());
			}
		}

	}



