package Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.setAcc_no(600008796);
		acc.setName("Sachin");
		acc.setEmail("sachin@gmail.com");
		acc.setAmount(500089.90f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());

	}

}
