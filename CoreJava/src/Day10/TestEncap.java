package Day10;

public class TestEncap
{
	public static void main(String[]args)
	{
		Account a=new Account();
		
		a.setAcc_no(60640003);
		a.setName("Peter");
		a.setEmail("peter@gmail.com");
		a.setAmount(12546.80f);
		
		System.out.println("Acoount number is :"+a.getAcc_no());
		System.out.println("Name of account holder is :"+a.getName());
		System.out.println("Email address of account holder is :"+a.getEmail());
		System.out.println("Balance is :"+a.getAmount());
	}

}
