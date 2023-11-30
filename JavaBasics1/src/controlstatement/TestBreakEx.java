package controlstatement;

public class TestBreakEx 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			if(i==3)//true
			{
				break;
			}
			System.out.println(i);
		}
	}
}
