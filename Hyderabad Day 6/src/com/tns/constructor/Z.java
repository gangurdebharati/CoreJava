package com.tns.constructor;

public class Z 
{
  void m(Z obj)
  {
	  System.out.println("Methid is invoked");
  }
  void p()
  {
	  m(this);
  }
	public static void main(String[] args)
	{
		Z obj=new Z();
		obj.p();

	}

}
