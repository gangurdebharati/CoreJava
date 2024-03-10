package com.sketo.swing;
import javax.swing.*;
public class SeparatorExample 
{
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	
	SeparatorExample()
	{
		JFrame f=new JFrame("Separator Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Pizza");
		i1=new JMenuItem("Cheess");
		i2=new JMenuItem("Golden Corn");
		i3=new JMenuItem("Capsicum");
		i4=new JMenuItem("Onian");
		i5=new JMenuItem("Chicken");
		
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
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		}
	public static void main(String[]args)
	{
		new SeparatorExample();
	}

}
