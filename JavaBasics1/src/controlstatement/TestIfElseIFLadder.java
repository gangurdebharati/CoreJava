package controlstatement;

public class TestIfElseIFLadder 
{
	public static void main(String[] args)
	{
		String city="Mumbai";
		
		if(city=="Nashik")//false
		{
			System.out.println("City is Nashik");
		}
		else if(city=="Pune")//false
		{
			System.out.println("City is Pune");
		}
		else if(city=="Delhi")//false
		{
			System.out.println("City is Delhi");
		}
		else
		{
			System.out.println(city);
		}

	}

}
