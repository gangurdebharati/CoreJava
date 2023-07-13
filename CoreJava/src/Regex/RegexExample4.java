package Regex;

import java.util.regex.*;  

public class RegexExample4
{  
public static void main(String args[])
{  
System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
System.out.println(Pattern.matches("[amn]", "amman"));//false (m and a comes more than once)  
}
}  