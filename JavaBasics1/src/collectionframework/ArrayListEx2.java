package collectionframework;
import java.util.*;

public class ArrayListEx2 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Tom");
		al.add("Jerry");
		al.add("John");
		al.add("Mike");
		
		System.out.println("Returning elements:"+al.get(1));
		
		al.set(1, "Neo");
		 
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
