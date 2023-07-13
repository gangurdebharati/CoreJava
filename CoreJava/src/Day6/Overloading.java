package Day6;

public class Overloading {
	
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println(z);
	}
	void add(int p, double q)
	{
		double m;
		m=p+q;
		System.out.println(m);
	}
	public static void main(String[] args) {
		
		Overloading obj=new Overloading();
		obj.add();
		obj.add(10, 20);
		obj.add(10, 20.10);
	}

}
