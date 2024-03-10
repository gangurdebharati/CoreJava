package com.sketo.swing;
import javax.swing.*;
public class OptionPaneExample 
{
	JFrame f;
	OptionPaneExample()
	{
		f=new JFrame();
		JOptionPane.showMessageDialog(f, "Welcome to SKETO Infotech");
	}
	public static void main(String[]args)
	{
		new OptionPaneExample();
	}

}
