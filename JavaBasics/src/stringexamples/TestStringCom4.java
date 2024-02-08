package stringexamples;

public class TestStringCom4 
{
	public static void main(String[] args) 
	{
		String s1="Tom";
		String s2="Tom";
		String s3="Jeeny";
		
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//4
		System.out.println(s3.compareTo(s1));//-4

	}

}
