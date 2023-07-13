package com.tns.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Tejbodhi2312@";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/test1";

	private static Connection cn = null;
	private static Properties properties = null;

	static {

		try {
			Class.forName(DB_DRIVER_CLASS);
			System.out.println("Driver class loaded sucessfully");// load driver

			properties = new Properties();

			properties.put("user", DB_USERNAME);
			properties.put("password", DB_PASSWORD);

			cn = DriverManager.getConnection(DB_URL, properties);

			// cn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);//register
			
			// driver /establish connection
			//System.out.println("Connection is Established");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			// e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error...");
			// e.printStackTrace();
		}

	}
		public static Connection getConnection() {
			
				return cn;
		}
	}