package com.sketo.swing;

import javax.swing.*;

public class JComboBox 
{
	JFrame f;
	JComboBox(String[] strings)
	{
		f=new JFrame("ComboBox Example");
	    String country[]= {"India","Australia","China","Japan","England"};
	    JComboBox cb=new JComboBox(country);
	}
	public static void main(String[] args)
	{
		

	}

}
