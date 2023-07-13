package CollectionFramework;

import java.util.*;

public class ArraytoList {

	public static void main(String[] args) {
		
		String[] arr= {"Java","Python","C++",".Net","PHP"};
		
		System.out.println("Printing array :"+Arrays.toString(arr));
		
	    List<String> list=new ArrayList<String>();
	    
	    for(String lang:arr)
	    {
	    	list.add(lang);
	    }
	    System.out.println("Printing List :"+list);
	}

}
