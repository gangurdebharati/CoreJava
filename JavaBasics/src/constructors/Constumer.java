package constructors;

public class Constumer 
{
	int empid;
	String empname;
	float salary;
	
	Constumer(int empid, String empname, float salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(empid + " " + empname + " "+salary);
	}
	public static void main(String[] args)
	{
		Constumer obj=new Constumer(111,"Peter",50789.9f);
		obj.display();
	}

}
