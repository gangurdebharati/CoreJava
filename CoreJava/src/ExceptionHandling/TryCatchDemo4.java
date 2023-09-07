package ExceptionHandling;

public class TryCatchDemo4
{
    public static void main(String[] args) 
    {  
        try
        {
        int data=50/0; //may throw exception  
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
          
        System.out.println("rest of the code");  
    }  
}
