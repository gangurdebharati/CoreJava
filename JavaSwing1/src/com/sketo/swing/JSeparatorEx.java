package com.sketo.swing;
import javax.swing.*;
public class JSeparatorEx 
{
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	
	JSeparatorEx()
	{
		JFrame f=new JFrame("Separator Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Fruits");
		i1=new JMenuItem("Apple");
		i2=new JMenuItem("Pineaaple");
		i3=new JMenuItem("Watermelon");
		i4=new JMenuItem("Grapes");
		i5=new JMenuItem("Strawberry");
		
		menu.add(i1);
		menu.addSeparator();
		menu.add(i2);
		menu.addSeparator();
		menu.add(i3);
		menu.addSeparator();
		menu.add(i4);
		menu.addSeparator();
		menu.add(i5);
		
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new JSeparatorEx();
	}
}
