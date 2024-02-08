package stringexamples;

public class TestStringCom2
{
	public static void main(String[] args) 
	{
		String s1="Tom";
		String s2="TOM";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true

	}

}
