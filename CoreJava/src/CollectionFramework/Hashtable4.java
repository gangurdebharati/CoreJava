package CollectionFramework;

import java.util.*;  

class Hashtable4
{  
 public static void main(String args[])
 {  
    Hashtable<Integer,String> map=new Hashtable<Integer,String>();    
    
     map.put(100,"Amit");    
     map.put(102,"Ravi");   
     map.put(101,"Vijay");    
     map.put(103,"Rahul");    
     
     System.out.println("Initial Map: "+map);  
     
       
     map.putIfAbsent(104,"Gaurav");  
     System.out.println("Updated Map: "+map);  
      
     map.putIfAbsent(101,"Peter");  
     System.out.println("Updated Map: "+map);  
 }  
}  