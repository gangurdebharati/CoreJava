package com.sketo.swing;
import javax.swing.*;
public class ListExample 
{
	ListExample()
	{
		JFrame f=new JFrame();
		DefaultListModel<String> l1=new DefaultListModel<String>();
		
		l1.addElement("Hardward");
		l1.addElement("Tally");
		l1.addElement("Networking");
		l1.addElement("UI/UX");
		l1.addElement("Software Testing");
		
		JList<String> list=new JList<>(l1);
		
		list.setBounds(100, 100, 150,155);
		f.add(list);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new ListExample();
	}

}
