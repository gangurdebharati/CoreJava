package Day7;

class Employee//super
{
	int salary=40000;
}
public class Programmer extends Employee
{
	int bouns=12000;
	
	public static void main(String[]args)
	{
		Programmer p=new Programmer();
		System.out.println("Programmer salary is :"+p.salary);
		System.out.println("Bonus of prpgrammer is :"+p.bouns);
		
	}

}
