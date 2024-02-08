package stringexamples;

public class EndsWithEx 
{
	public static void main(String[] args)
	{
		String s1="Foundation";
		System.out.println(s1.endsWith("t"));//false
		System.out.println(s1.endsWith("n"));//true
		System.out.println(s1.endsWith("tion"));//true

	}

}
