package encapsulation;

public class TestEncapsulation 
{
	public static void main(String[] args) 
	{
		Account acc=new Account();
		
		acc.setAcc_no(602445678);
		acc.setName("Tom Rio");
		acc.setEmail("tom@gmail.com");
		acc.setAmount(50567.97f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());

	}

}
