package controlstatement;

public class TestNestedIf 
{
	public static void main(String[] args) 
	{
		int x=30,y=10;
		
		if(x==31)
		{
			if(y==12)
			{
				System.out.println("Value of x is equal to 30 and value of y is equal to 10");
			}
			else
			{
				System.out.println("Value of y is not equal to 10");
			}
		}
		else
		{
			System.out.println("Value of x is not equal to 30");
		}
		

	}

}
