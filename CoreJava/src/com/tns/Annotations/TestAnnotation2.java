package com.tns.Annotations;

import java.util.*;  

class TestAnnotation2
{  
@SuppressWarnings("unchecked")
public static void main(String args[])
{  
@SuppressWarnings("rawtypes")
ArrayList list=new ArrayList();  
list.add("Peter");  
list.add("Tom");  
list.add("Jerry");  
  
for(Object obj:list)  
System.out.println(obj);  
  
}
}  