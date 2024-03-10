package com.sketo.swing;
import javax.swing.*;
public class JTableExample
{
	JFrame f; 
	JTableExample()
	{
		f=new JFrame();
		
		String data[][]= {{"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"},
				          {"101","Radha","35000"},
				          {"102","Priyanka","40000"},
				          {"103","Mohit","45000"}
		                 };
		String column[]= {"ID","NAME","SALARY"};
		
		JTable jt=new JTable(data,column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	
	}
	public static void main(String[]args)
	{
		new JTableExample();
	
	}
}
