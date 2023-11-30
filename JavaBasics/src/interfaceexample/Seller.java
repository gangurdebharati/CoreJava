package interfaceexample;

public class Seller implements Client
{
	@Override
	public void purchase()
	{
		System.out.println("Client needs "+amount+" kg wheat.");
	}
	public static void main(String[] args) 
	{
		Client obj=new Seller();
		obj.purchase();
	}

}
