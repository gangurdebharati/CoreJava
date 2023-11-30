package encapsulation;

public class TestEncap 
{
	public static void main(String[] args)
	{
		Account acc=new Account();
		
		acc.setAcc_no(60243567);
		acc.setName("Peter Parkar");
		acc.setEmail("peter@gmail.com");
		acc.setAmount(50000.67f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());	

	}

}
