package CollectionFramework;

import java.util.*;

public class ListExample1 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Mango");
		list.add("Banana");
		list.add("Kiwi");
		list.add("Watermelon");
		list.add("Pineapple");
		
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
	}

}
