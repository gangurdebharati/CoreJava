package objectarray;

public class Book 
{
	private int BookId;
	private String BookName;
	private String AuthorName;
	private int Price;
	
	//setter & getter method
	public int getBookId()
	{
		return BookId;
	}
	public void setBookId(int bookId)
	{
		BookId=bookId;
	}
	public String getBookName()
	{
		return BookName;
	}
	public void setBookName(String bookname)
	{
		BookName=bookname;
	}
	public String getAuthorName()
	{
		return AuthorName;
	}
	public void setAuthorName(String authorname)
	{
		AuthorName=authorname;
	}
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		Price=price;
	}
	
	//class constructor
	
	Book(int BookId,String BookName, String AuthorName, int Price)
	{
		this.BookId=BookId;
		this.BookName=BookName;
		this.AuthorName=AuthorName;
		this.Price=Price;
	}
	
	//toString method to print information
	
	public String toString()
	{
		return "Book [BookId="+ BookId + " ,BookName=" + BookName + " ,AuthorName=" + AuthorName + " ,Price="
				+ Price +"]";
	}
}