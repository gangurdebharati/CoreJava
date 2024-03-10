package com.sketo.swing;
import javax.swing.*;
public class OptionPane1
{
	JFrame f;
	OptionPane1()
	{
		f=new JFrame();
		String name=JOptionPane.showInputDialog(f, "Enter your name");
	}
	public static void main(String[]args)
	{
		new OptionPane1();
	}
}
