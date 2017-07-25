package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {
	
	public static Connection createstatement(){
		
		
		Connection conn  = null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","root");
		System.out.println("Connected");
		return conn;
	}
		catch(Exception e){
			System.out.println(e);
		}
	
		return conn;
	}
}
