package polymorphism;

class Shape
{
	void draw()
	{
		System.out.println("Can't define shape type...");
	}
}
class Square extends Shape
{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("Square shape ");
	}
}
public class MethodOverridingDemo 
{
	public static void main(String[]args)
	{
		Square obj=new Square();
		obj.draw();
	}

}
