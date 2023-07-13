package CollectionFramework;
import java.util.*;
public class TestCollection1 
{
 public static void main(String[]args)
 {
	 Queue<String> queue= new PriorityQueue<String>();
	 
	 queue.add("Roger");
	 queue.add("Sakshi");
	 queue.add("Irfan");
	 queue.add("Prajawal");
	 queue.add("Priya");
	 
	 System.out.println("Head "+queue.element());
	 System.out.println("head "+queue.peek());
	 
	 System.out.println("Iterating the queue elements :");
	 
	 Iterator i=queue.iterator();
	 
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	 queue.remove();
	 
	 System.out.println("After removing elements :");
	 
	 Iterator i2=queue.iterator();
	 
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	 
 }
}
