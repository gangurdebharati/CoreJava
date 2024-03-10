package com.sketo.swing;
import javax.swing.*;
import java.awt.*;
public class ToolBarExample 
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("JToolBarExample");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JToolBar toolbar=new JToolBar();
		toolbar.setRollover(true);
		JButton button=new JButton("File");
		toolbar.add(button);
		toolbar.addSeparator();
		toolbar.add(new JButton("Edit"));
		//toolbar.add(new JComboBox(new String[] {"Option-1","Option-2","Option-3","Option-4","Option-5"}));
		Container contentPane=f.getContentPane();
		contentPane.add(toolbar,BorderLayout.NORTH);
		JTextArea area=new JTextArea();
		JScrollPane jp=new JScrollPane(area);
		contentPane.add(jp,BorderLayout.EAST);
		f.setSize(500, 500);
		f.setVisible(true);
	}

}

