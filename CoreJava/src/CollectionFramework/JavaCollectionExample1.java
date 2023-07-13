package CollectionFramework;

import java.util.Collections;  
import java.util.HashSet;  
import java.util.Set;  

public class JavaCollectionExample1 
{  
    public static void main(String[] args) 
    {  
        Set<Integer> set = new HashSet<>();  
         
        set.add(2);  
        set.add(5);
        
        System.out.println("Initial collection :"+set);  
          
        Collections.addAll(set, 11, 12, 13, 14, 15);  
        System.out.println("Final Collection : "+set);  
          
        int size =set.size();  
        
        System.out.println("Size of Collection : "+size);  
         
        Boolean val=set.contains(5);  
        if (val){  
            System.out.println("5 is present in the collection");  
        }  
        else{  
            System.out.println("5 is not present in the collection");  
        }  
          
        set.clear();  
        System.out.println("Elements in collection : "+set);  
    }  
}  
