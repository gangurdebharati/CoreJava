package Regex;

import java.util.regex.*;

class RegexExample2
	{  
		public static void main(String args[])	
			{  
				System.out.println(Pattern.matches(".s", "as"));//true  
				System.out.println(Pattern.matches(".s", "mk"));  //false
				System.out.println(Pattern.matches(".s", "mst")); // false
				System.out.println(Pattern.matches(".s", "amms"));  //false
				System.out.println(Pattern.matches("..s", "mas"));  //true
            }
	}  
