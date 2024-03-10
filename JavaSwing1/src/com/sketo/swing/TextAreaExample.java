package com.sketo.swing;

import javax.swing.*;

public class TextAreaExample 
{
	TextAreaExample()
	{
		JFrame f=new JFrame("TextArea Example");
		JTextArea area=new JTextArea("Flat No.450, Floor No. 4, Building No.4,"
				+ "Unit 4,Lodha Quality Homes,Majiwada,"
				+ "Thane,Maharashtra");
		
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TextAreaExample();

	}

}
