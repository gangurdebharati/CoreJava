package CollectionFramework;

import java.io.*;  
import java.util.*;  
    
public class JavaIteratorExample 
{  
    public static void main(String[] args)  
    {  
        ArrayList<String> cityNames = new ArrayList<String>();  
    
        cityNames.add("Delhi");  
        cityNames.add("Mumbai");  
        cityNames.add("Kolkata");  
        cityNames.add("Chandigarh");  
        cityNames.add("Noida");  
      
        Iterator itr = cityNames.iterator();  
    
        System.out.println("CityNames elements : ");  
    
        while(itr.hasNext())  
        {
            System.out.print(itr.next() + " ");  
        }
         
    }  
}  