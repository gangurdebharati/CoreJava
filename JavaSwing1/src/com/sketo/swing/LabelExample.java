package com.sketo.swing;

import javax.swing.*;

public class LabelExample 
{
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Label Example");
		JLabel l1,l2;
		
		l1=new JLabel("First Name");
		l1.setBounds(50, 50, 100, 30);
		
		l2=new JLabel("Last Name");
		l2.setBounds(50,100, 100, 30);
		
		f.add(l1);
		f.add(l2);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
