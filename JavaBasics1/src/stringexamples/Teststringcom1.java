package stringexamples;

public class Teststringcom1
{
	public static void main(String[] args)
	{
		String s1="Tom";
		String s2="Tom";
		String s3=new String("Tom");
		String s4="Peter";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		

	}

}
