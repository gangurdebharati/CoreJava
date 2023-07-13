package Encapsulation;

public class Cars 
{
	private String name;
	private double price;
	private int topspeed;
	
    public Cars(String name, double price, int topspeed)
    {
    	this.name=name;
    	this.price=price;
    	this.topspeed=topspeed;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
    
}