package Generics;

public class TestGeneric4 
{
	public static void main(String[] args)
	{
	 MyGen<Integer> m=new MyGen<Integer>();
	 m.add(2);
	
	 //m.add("Yash");
	 System.out.println(m.get());

	}

}
