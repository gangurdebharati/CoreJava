package LambdaExpression;
//without lambda expression

public class LambdaExpressionExample
{  
	public static void main(String[] args) 
    {  
        int width=10;
        
    
        Drawable d=()->{System.out.println("Drawing "+width);};
        d.draw();
        
    }
        
}  
