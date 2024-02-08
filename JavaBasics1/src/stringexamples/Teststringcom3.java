package stringexamples;

public class Teststringcom3 
{
	public static void main(String[] args)
	{
		String s1="Peter";
		String s2="Peter";
		String s3=new String("Peter");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false

	}

}
