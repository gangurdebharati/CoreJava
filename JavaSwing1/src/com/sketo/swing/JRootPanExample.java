package com.sketo.swing;
import javax.swing.*;

public class JRootPanExample 
{
	public static void main(String[] args) 
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRootPane root=f.getRootPane();
		
		//create menu bar
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("File");
		bar.add(menu);
		menu.add("Open");
		menu.add("Close");
		root.setJMenuBar(bar);
		
		root.getContentPane().add(new JButton("Press Me"));
		f.pack();
		f.setVisible(true);

	}

}
