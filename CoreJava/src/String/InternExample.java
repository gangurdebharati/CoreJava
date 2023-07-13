package String;

public class InternExample
	{  
		public static void main(String args[])
			{  
			String s1=new String("hello");  //new-heap  
			String s2="hello";  //string constant pool, false because reference variables are pointing to different instance  
			String s3=s2.intern();  //true because reference variables are pointing to same instance  
			System.out.println(s1==s2);  
			System.out.println(s2==s3);  
			}
   }  