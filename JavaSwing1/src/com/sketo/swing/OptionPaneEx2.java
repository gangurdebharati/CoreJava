package com.sketo.swing;
import javax.swing.*;
public class OptionPaneEx2 
{
	JFrame f;
	OptionPaneEx2()
	{
		f=new JFrame();
		String name=JOptionPane.showInputDialog(f,"Enter your name :");
	}
	public static void main(String[]arg)
	{
		new OptionPaneEx2();
	}

}
