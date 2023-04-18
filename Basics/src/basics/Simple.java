package basics;

public class Simple {
	
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome");
		Simple obj=new Simple();
		obj.add();
	}

}
