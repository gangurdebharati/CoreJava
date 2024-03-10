package com.sketo.swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DialogEx
{
	private static JDialog d;
	DialogEx()
	{
		JFrame f=new JFrame();
		d=new JDialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		JButton b=new JButton("OK");
		b.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				DialogEx.d.setVisible(true);
			}
				}
				
				);
		
		d.add(new JLabel("Click button to continue."));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);
	}
	public static void main(String[]args)
	{
		new DialogEx();
	}

}
