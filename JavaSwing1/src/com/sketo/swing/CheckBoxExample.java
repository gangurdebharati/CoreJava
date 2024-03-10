package com.sketo.swing;

import javax.swing.*;

public class CheckBoxExample 
{
	CheckBoxExample()
	{
		JFrame f=new JFrame("CheckBox Example");
		
		JCheckBox c1=new JCheckBox("Java");
		c1.setBounds(50, 100, 80, 50);
		
		JCheckBox c2=new JCheckBox("C++");
		c2.setBounds(50, 150, 50, 50);
		
		f.add(c1);
		f.add(c2);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CheckBoxExample();
	}

}
