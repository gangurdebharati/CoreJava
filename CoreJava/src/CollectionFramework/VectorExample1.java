package CollectionFramework;

import java.util.*;  

public class VectorExample1
{  
       public static void main(String args[]) 
       {  
          Vector<String> vec = new Vector<String>();  
           
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
           
          System.out.println("Size is: "+vec.size());  
          System.out.println("Default capacity is: "+vec.capacity());  
           
          System.out.println("Vector element is: "+vec);  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
            
           
          System.out.println("Elements are: "+vec);  
                  
            if(vec.contains("Tiger"))  
            {  
               System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
            }  
            else  
            {  
               System.out.println("Tiger is not present in the list.");  
            }  
           
          System.out.println("The first animal of the vector is = "+vec.firstElement());   
           
          System.out.println("The last animal of the vector is = "+vec.lastElement());   
       }  
}  