package stringexamples;

public class TestStringCom3 
{
	public static void main(String[] args)
	{
		String s1="Tom";
		String s2="Tom";
		String s3=new String("Tom");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false

	}

}
