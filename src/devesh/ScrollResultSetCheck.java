package devesh;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class ScrollResultSetCheck {
	public static void main(String[] args) {
		
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","root");
		System.out.println("Connected");
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String s = "select * from emp";
		ResultSet res = st.executeQuery(s);
		res.afterLast();
		while(res.previous()){
			System.out.println(res.getString(1)+"\t"+res.getString(2));
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}