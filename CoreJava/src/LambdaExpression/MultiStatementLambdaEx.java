package LambdaExpression;


@FunctionalInterface  
interface Say
{  
    String say(String message);  
}  
  
public class MultiStatementLambdaEx
{  
    public static void main(String[] args) 
    {  
      
        // You can pass multiple statements in lambda expression  
        Say person = (message)-> {  
            String str1 = "I would like to say, ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(person.say("time is precious."));  
    }  
}  

