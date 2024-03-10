package com.sketo.swing;

import javax.swing.*;

public class TextFieldExample 
{
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("TextField Example");
		
		JTextField t1=new JTextField("Welcome to Sketo Infotech");
		
		t1.setBounds(50, 100, 200, 30);
		
		f.add(t1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
