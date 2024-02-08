package collectionframework;
import java.util.*;

public class Treeset1
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> al=new TreeSet<Integer>();
		al.add(23);
		al.add(12);
		al.add(14);
		al.add(25);
		

		System.out.println("Lowest value:"+al.pollFirst());
		System.out.println("Highest value:"+al.pollLast());
		

	}

}
