package com.sketo.swing;

import javax.swing.*;
import java.awt.*;

public class IconExample
{
	IconExample()
	{
		JFrame f=new JFrame();
		Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\thirt\\OneDrive\\Desktop\\Lodha Receipts\\logo.png");
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(200, 200);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new IconExample();
	}

}
