package com.sketo.swing;
import javax.swing.*;
public class TableExample 
{
	JFrame f;
	TableExample()
	{
		f=new JFrame();
		
		String data[][]= {{"101","Tom","45000"},
				          {"102","Jerry","60000"},
				          {"103","Merry","56000"}
		                 };
		String column[]= {"ID","Name","Salary"};
		
		JTable jt=new JTable(data,column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new TableExample();
	}
}
