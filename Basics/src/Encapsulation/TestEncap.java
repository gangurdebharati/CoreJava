package Encapsulation;

public class TestEncap {

	public static void main(String[] args) 
	{
		EncapEmployee e=new EncapEmployee();
		e.setId(1);
		e.setName("Tom");
		e.setSalary(340000);
		
		System.out.println("ID :"+e.getId());
		System.out.println("Name :"+e.getName());
		System.out.println("Salary :"+e.getSalary());

	}

}
