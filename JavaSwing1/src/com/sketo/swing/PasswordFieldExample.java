package com.sketo.swing;

import javax.swing.*;

public class PasswordFieldExample 
{
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("PasswordField Example");
		JPasswordField p=new JPasswordField();
		JLabel l1=new JLabel("Enter your Password :");
		l1.setBounds(5, 100, 150, 30);
		p.setBounds(150, 100, 100, 30);
		
		f.add(l1);
		f.add(p);
		
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
