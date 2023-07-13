package LambdaExpression;

@FunctionalInterface
interface SingleParameter
{  
	   public String say(String name);  
}  
	  
public class SingleParameterLambdaExpression
{  
	    public static void main(String[] args) {  
	      
	         
	    	SingleParameter s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Peter"));  
	          
	          
	        SingleParameter s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.say("Tom"));  
	    }  
	}  


