package mypack;

class Test
{
	 int data=40;
	 void msg()
	{
		System.out.println("Hello Students...");
	}
}
public class TestPrivateModifier 
{
	public static void main(String[]args)
	{
		Test t=new Test();
		System.out.println(t.data);
		t.msg();
	}

}
