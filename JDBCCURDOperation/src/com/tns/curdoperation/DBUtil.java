package com.tns.curdoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
	private static Connection cn;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Tejbodhi2312@";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/test1";
	
	public static Connection getConnetion()
	{
		try 
		{
			Class.forName(DB_DRIVER_CLASS);// to load database driver
			System.out.println("Driver loaded successfully....");

			// connect to database
			cn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection established successfully....");

		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error....." + e.getMessage());
			// e.printStackTrace();
		} catch (SQLException e) 
		{
			System.out.println("Error....." + e.getMessage());
		}
		return cn;
	}
}