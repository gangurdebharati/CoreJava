package Day6;

class Shape //super
{
	/*void draw()
	{
		System.out.println("Can't define shape types");
	}*/
}
class Square extends Shape
{
	@Override
	void draw()
	{
		
		System.out.println("Square Shape");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Square obj=new Square();
		obj.draw();

	}

}
