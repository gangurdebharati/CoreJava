package com.sketo.swing;
import javax.swing.*;
public class JListExample 
{
	JListExample()
	{
		JFrame f=new JFrame();
		DefaultListModel<String> l1=new DefaultListModel<String>();
		
		l1.addElement("WaterMelon");
		l1.addElement("Pinneaaple");
		l1.addElement("Grapes");
		l1.addElement("Strawberry");
		l1.addElement("Apple");
		
		JList<String> list=new JList<>(l1);
		list.setBounds(100, 100, 150,100);
		f.add(list);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new JListExample();
	}
	

}
