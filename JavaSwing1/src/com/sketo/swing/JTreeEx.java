package com.sketo.swing;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeEx 
{
	JFrame f;
	JTreeEx()
	{
		f=new JFrame();
		
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color");
		DefaultMutableTreeNode language=new DefaultMutableTreeNode("Language");
		
		style.add(color);
		style.add(language);
		
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("Red");
		DefaultMutableTreeNode green=new DefaultMutableTreeNode("Green");
		DefaultMutableTreeNode yellow=new DefaultMutableTreeNode("Yellow");
		
		color.add(red);
		color.add(green);
		color.add(yellow);
		
		DefaultMutableTreeNode marathi=new DefaultMutableTreeNode("Marathi");
		DefaultMutableTreeNode hindi=new DefaultMutableTreeNode("Hindi");
		DefaultMutableTreeNode english=new DefaultMutableTreeNode("English");
		
		language.add(marathi);
		language.add(hindi);
		language.add(english);
		
		JTree jt=new JTree(style);
		f.add(jt);
		f.setSize(300, 500);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new JTreeEx(); 
	}
}
