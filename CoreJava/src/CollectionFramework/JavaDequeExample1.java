package CollectionFramework;

import java.util.ArrayDeque;  
import java.util.Deque;  
  
public class JavaDequeExample1
{  
  public static void main(String[] args)
  {  
    Deque<Integer> deque = new ArrayDeque<Integer>();  
      
    deque.add(1);  
    deque.add(2);  
    deque.add(3);  
    System.out.println("Inserting three elements : ");  
    
    for(Integer integer : deque)
    {  
    System.out.println(integer);      
    }  
      
    deque.pop(); 
    deque.pop();
    deque.pop();
    System.out.println("After popping : ");  
    for(Integer integer : deque)
    {  
        System.out.println(integer);  
    }  
      
  }  
}  